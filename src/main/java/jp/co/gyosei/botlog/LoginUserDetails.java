package jp.co.gyosei.botlog;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

public class LoginUserDetails implements UserDetails{

	private static final long serialVersionUID = 1L;

	private CustinfoEntityImpl custinfoEntityImpl;

	//権限情報を保存します
	@Autowired
	private Collection<GrantedAuthority> role;

	//コンストラクタです。
	public LoginUserDetails(
			CustinfoEntityImpl x_custinfoEntityImpl, Collection<GrantedAuthority> role
			){
		this.custinfoEntityImpl = x_custinfoEntityImpl;
		this.role = role;
	}

	public LoginUserDetails(LoginCust role, Collection<GrantedAuthority> authorities) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//どの列をユーザー名として使うのか
	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return custinfoEntityImpl.getCustid();
	}
	
	//どの列をパスワードとして使うのか
	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return custinfoEntityImpl.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public Collection<GrantedAuthority> getAuthority() {
		return role;
	}

	public void setAuthority(Collection<GrantedAuthority> role) {
		this.role = role;
	}

}