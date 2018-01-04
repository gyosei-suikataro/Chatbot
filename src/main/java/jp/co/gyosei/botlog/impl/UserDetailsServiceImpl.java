package jp.co.gyosei.botlog.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import org.springframework.security.core.GrantedAuthority;

import jp.co.gyosei.botlog.LoginCust;
import jp.co.gyosei.botlog.LoginUserDetails;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private CustinfoRepositoryCustom custinfoRepositoryCustom;

	@Override
	public UserDetails loadUserByUsername(String custid)
			throws UsernameNotFoundException {

		CustinfoEntityImpl cust = custinfoRepositoryCustom.findOne(custid);
		if (cust == null) {
			throw new UsernameNotFoundException("ユーザーが見つかりませんでした。");
		}

		LoginCust role = null;
		return new LoginUserDetails(cust, getAuthorities(role));
	}

	@SuppressWarnings("unused")
	private Collection<GrantedAuthority> getAuthorities(LoginCust role){
		if(role.getAuthorities().equals("ADMIN")){
			return AuthorityUtils.createAuthorityList("USER","ADMIN");
		} else {
			return AuthorityUtils.createAuthorityList("USER");
		}
	}
}
