package jp.co.gyosei.botlog;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

public class LoginUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	private String custid;
    private String password;
    private Collection<GrantedAuthority> role;


    public LoginUserDetails(String custid, String password, Collection<GrantedAuthority> role) {
        super();
        this.custid = custid;
        this.password = password;
        this.role = role;
    }


	public LoginUserDetails(CustinfoEntityImpl cust) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public LoginUserDetails(LoginCust role, Collection<GrantedAuthority> authorities) {
		// TODO 自動生成されたコンストラクター・スタブ
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}


	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
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
