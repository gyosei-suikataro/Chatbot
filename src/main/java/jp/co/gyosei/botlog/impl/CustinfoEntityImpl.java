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
	public Collection<? extends GrantedAuthority> role;

	public CustinfoEntityImpl(String custid, String password, Collection<? extends GrantedAuthority> role) {
 
		this.custid = custid;
		this.password = password;
		this.role = role;
	}

	public String getCustid() {
		return this.custid;
	}

	public void setUsername(String custid) {
		this.custid = custid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<? extends GrantedAuthority> getRole() {
		return role;
	}

	public void setRole(Collection<GrantedAuthority> role) {
		this.role = role;
	}
	
    public UserDetails toLoginUserDetails() {
        return LoginUserDetails.create(this);
    }

}
