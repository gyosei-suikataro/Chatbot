package jp.co.gyosei.botlog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

public class LoginUserDetails implements UserDetails {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String custid;
    private String password;
    private Collection<GrantedAuthority> role;

    public LoginUserDetails(String username, String password,
           Collection<GrantedAuthority> authorities) {
        super();
        this.custid = username;
        this.password = password;
        this.role = authorities;
    }

	public LoginUserDetails(CustinfoEntityImpl custinfoEntityImpl) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/**
    * {@link Users}を元にインスタンスを生成します。
    * @param user 生成元になるユーザ
    * @return
    */
    public static UserDetails create(CustinfoEntityImpl entity) {
        return new LoginUserDetails(entity.getUsername(), entity.getPassword(), entity.getAuthorities());
    }

	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return this.role;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return this.custid;
	}
	
	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return this.password;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}