/*
package jp.co.gyosei.botlog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public abstract class LoginUserDetails implements UserDetails {
	private String custid;
	private String password;
	private Collection<GrantedAuthority> role;

	public LoginUserDetails(String custid, String password, Collection<GrantedAuthority> role) {
		super();
		this.custid = custid;
		this.password = password;
		this.role = role;
	}

	public static UserDetails create(LoginCust cust) {
		List<GrantedAuthority> role = new ArrayList<GrantedAuthority>();
		for(LoginCust auth: cust.getRole()){
			role.add(new SimpleGrantedAuthority(auth.getCustid().getRole()));
		}
		return new LoginUserDetails(cust.getCustid(), cust.getPassword(), role);
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

	public void setCustid(String custid) {
		this.custid = custid;
	}
}
*/