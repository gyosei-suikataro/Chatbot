package jp.co.gyosei.botlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import jp.co.gyosei.botlog.domain.entity.LoginCustinfoEntityImpl;
import jp.co.gyosei.botlog.domain.repository.LoginCustinfoRepository;

@Component
public class AuthenticationProviderImpl implements AuthenticationProvider {

    @Autowired
    private LoginCustinfoRepository loginCustinfoRepository;

    @SuppressWarnings("unused")
	@Override
    public Authentication authenticate(Authentication auth)
            throws AuthenticationException {

        String custid = auth.getName();
        String password = auth.getCredentials().toString();

        if ("".equals(custid) || "".equals(password)) {
            // 例外はSpringSecurityにあったものを適当に使用
            throw new AuthenticationCredentialsNotFoundException("ログイン情報に不備があります。");
        }

		LoginCustinfoRepository UserRepository = loginCustinfoRepository.loginCustinfoRepository(custid, password);
        if (custid == null) {
            // 例外はSpringSecurityにあったものを適当に使用
            throw new AuthenticationCredentialsNotFoundException("ログイン情報が存在しません。");
        }

        return new UsernamePasswordAuthenticationToken(new LoginCustinfoEntityImpl(), password, auth.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> token) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(token);
    }

	public LoginCustinfoRepository getLoginCustinfoRepository() {
		return loginCustinfoRepository;
	}

	public void setLoginCustinfoRepository(LoginCustinfoRepository loginCustinfoRepository) {
		this.loginCustinfoRepository = loginCustinfoRepository;
	}
}
