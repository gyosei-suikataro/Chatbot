package com.example.sample;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chatbot database table.
 * 
 */
@Entity
@Table(name="custinfo2")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer NO;

	@Column
	private String CUSTID;
	@Column
	private String CUSTNAME;
	@Column
	private String ORGNAME;
	@Column
	private String PASSWORD;
	@Column
	private String EFFECT;
	@Column
	private String ROLE;
	
	

	public User() {
	}
	
	public User(Integer NO,String CUSTID,String CUSTNAME,String ORGNAME,String PASSWORD,String EFFECT,String ROLE) {
		this.NO = NO;
		this.CUSTID = CUSTID;
        this.CUSTNAME = CUSTNAME;
        this.ORGNAME = ORGNAME;
        this.PASSWORD = PASSWORD;
        this.EFFECT = EFFECT;
        this.ROLE = ROLE;
    }

	public Integer getNo() {
		return this.NO;
	}

	public void setNo(Integer NO) {
		this.NO = NO;
	}
	public String getCustid() {
		return this.CUSTID;
	}

	public void setCustid(String CUSTID) {
		this.CUSTID = CUSTID;
	}

	public String getCustname() {
		return this.CUSTNAME;
	}

	public void setCustname(String CUSTNAME) {
		this.CUSTNAME = CUSTNAME;
	}
	
	public String getOrgname() {
		return this.ORGNAME;
	}

	public void setOrgname(String ORGNAME) {
		this.ORGNAME = ORGNAME;
	}

	public String getPassword() {
		return this.PASSWORD;
	}

	public void setPassword(String PASSWORD) {
		this.PASSWORD = PASSWORD;
	}
	
	public String getEffect() {
		return this.EFFECT;
	}

	public void setEffect(String EFFECT) {
		this.EFFECT = EFFECT;
	}

	public String getRole() {
		return this.ROLE;
	}

	public void setRole(String ROLE) {
		this.ROLE = ROLE;
	}


}