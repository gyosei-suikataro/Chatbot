package jp.co.gyosei.botlog.impl;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jp.co.gyosei.botlog.LoginUserDetails;

@Entity
@Table(name="custinfo")
public class CustinfoEntityImpl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	public String custid;
	@Column
	public String password;
	@Column
	public Collection<GrantedAuthority> role;

	public CustinfoEntityImpl() {
	}

	public CustinfoEntityImpl(String custid, String password, Collection<GrantedAuthority> role) {
 
		this.custid = custid;
		this.password = password;
		this.role = role;
	}

	public String getCustid() {
		return this.custid;
	}

	public void setUsername(String username) {
		this.custid = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<GrantedAuthority> getAuthorities() {
		return role;
	}

	public void setRole(Collection<GrantedAuthority> authorities) {
		this.role = authorities;
	}
	
    public UserDetails toLoginUserDetails() {
        return LoginUserDetails.create(this);
    }

	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return this.getUsername();
	}

}
