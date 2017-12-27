package jp.co.gyosei.botlog.domain.form;

import org.hibernate.validator.constraints.NotEmpty;

public class CustomerForm {

	private Integer no;
	
	@NotEmpty(message = "入力されていません")
	private String custid;
	@NotEmpty(message = "入力されていません")
	private String custname;
	@NotEmpty(message = "入力されていません")
	private String orgname;
	@NotEmpty(message = "入力されていません")
	private String password;
	
	private String effect;
	private String role;
	
	
	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}
	
	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}
	
	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
    
    
}
