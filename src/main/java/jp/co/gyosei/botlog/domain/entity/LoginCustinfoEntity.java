package jp.co.gyosei.botlog.domain.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="custinfo")
public class LoginCustinfoEntity implements Serializable {

	@Id
	@Column
	private String custid;
	@Column
	private String password;
	@Column
	private String role;

	public LoginCustinfoEntity() {
	}

	public LoginCustinfoEntity(String custid,String password,String role) {
 
		this.custid = custid;
		this.password = password;
		this.role = role;
	}

	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}