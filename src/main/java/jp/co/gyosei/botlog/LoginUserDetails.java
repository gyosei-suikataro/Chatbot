package jp.co.gyosei.botlog;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

public class LoginUserDetails implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CustinfoEntityImpl custinfoEntityImpl;

	//権限情報を保存します
	@Autowired
	private Collection<GrantedAuthority> authorities;

	//コンストラクタです。
	public LoginUserDetails(
			CustinfoEntityImpl x_custinfoEntityImpl, Collection<GrantedAuthority> role
			){
		this.custinfoEntityImpl = x_custinfoEntityImpl;
		this.authorities = role;
	}

	public LoginUserDetails(LoginCust role, Collection<GrantedAuthority> authorities2) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//自分用に、どの列をパスワードとして使うのか変えましょう。
	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return custinfoEntityImpl.getPassword();
	}

	//自分用に、どの列をユーザー名として使うのかを変えましょう
	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return custinfoEntityImpl.getCustid();
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

}