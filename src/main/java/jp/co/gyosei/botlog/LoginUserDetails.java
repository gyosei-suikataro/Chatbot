package jp.co.gyosei.botlog;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public abstract class LoginUserDetails implements UserDetails{

	private LoginCust cust;

	//権限情報を保存します
	private Collection<GrantedAuthority> role;

	//コンストラクタです。
	public LoginUserDetails(
			LoginCust custid, Collection<GrantedAuthority> role
			){
		this.cust = custid;
		this.setRole(role);
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return role();
	}

	private Collection<GrantedAuthority> role() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	//自分用に、どの列をユーザー名として使うのかを変えましょう
	public String getCustid() {
		// TODO 自動生成されたメソッド・スタブ
		return cust.getCustid();
	}

	//自分用に、どの列をパスワードとして使うのか変えましょう。
	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return cust.getPassword();
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

	public Collection<GrantedAuthority> getRole() {
		return role;
	}

	public void setRole(Collection<GrantedAuthority> role) {
		this.role = role;
	}
}