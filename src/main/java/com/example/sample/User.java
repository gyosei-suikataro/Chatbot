package com.example.sample;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chatbot database table.
 * 
 */
@Entity
@Table(name="chatbot")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer no;

	@Column
	private String userid;
	@Column
	private String username;
	@Column
	private String orgname;
	@Column
	private String password;
	@Column
	private String effect;
	@Column
	private String auth;
	
	

	public User() {
	}
	
	public User(Integer no,String userid,String username,String orgname,String password,String effect,String auth) {
		this.no = no;
		this.userid = userid;
        this.username = username;
        this.orgname = orgname;
        this.password = password;
        this.effect = effect;
        this.auth = auth;
    }

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getOrgname() {
		return this.orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}


}