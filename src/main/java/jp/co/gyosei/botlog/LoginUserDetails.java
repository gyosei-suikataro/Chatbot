package jp.co.gyosei.botlog;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import  jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

public class LoginUserDetails implements UserDetails{

	private static final long serialVersionUID = 1L;

	private CustinfoEntityImpl custinfoEntityImpl;

	//権限情報を保存します
	private Collection<GrantedAuthority> role;

	//コンストラクタです。
	public LoginUserDetails(
			CustinfoEntityImpl custid, Collection<GrantedAuthority> role
			){
		this.setCustid(custid);
		this.role = role;
	}

	public Collection<GrantedAuthority> getRole() {
		// TODO 自動生成されたメソッド・スタブ
		return role;
	}

	//自分用に、どの列をパスワードとして使うのか変えましょう。
	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return custinfoEntityImpl.getPassword();
	}

	//自分用に、どの列をユーザー名として使うのかを変えましょう
	public String getCustid() {
		// TODO 自動生成されたメソッド・スタブ
		return custinfoEntityImpl.getCustid();
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

	public CustinfoEntityImpl getCustinfoEntityImpl() {
		return custinfoEntityImpl;
	}

	public void setCustinfoEntityImpl(CustinfoEntityImpl custinfoEntityImpl) {
		this.custinfoEntityImpl = custinfoEntityImpl;
	}

	public void setRole(Collection<GrantedAuthority> role) {
		this.role = role;
	}

	public void setCustid(CustinfoEntityImpl custid) {
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}