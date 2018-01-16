package jp.co.gyosei.botlog.domain.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;

//import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;

@Entity
@Table(name="custinfo")
public class CustinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;
	
	@Column
	public String custid;

	private String custname;

	private String orgname;

	public String password;

	private String effect;

	public Collection<? extends GrantedAuthority> role;

	public CustinfoEntity(Integer no,String custid,String custname,String orgname,String password,String effect,Collection<? extends GrantedAuthority> role) {
		this.no = no; 
		this.custid = custid;
		this.custname = custname;
		this.orgname = orgname;
		this.password = password;
		this.effect = effect;
		this.role = role;
	}

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
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

	public Collection<? extends GrantedAuthority> getRole() {
		return this.role;
	}

	public void setRole(Collection<GrantedAuthority> role) {
		this.role = role;
	}

	public static CustinfoEntity custinfoRepositoryCustom(String custid, String password,
			String role) {
		return null;
	}
}
