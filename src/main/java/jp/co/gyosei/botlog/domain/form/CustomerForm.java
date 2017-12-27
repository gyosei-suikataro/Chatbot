package jp.co.gyosei.botlog.domain.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

import jp.co.gyosei.botlog.domain.validation.GroupOrder1;
import jp.co.gyosei.botlog.domain.validation.GroupOrder2;

public class CustomerForm {

	private Integer no;
	
	@NotEmpty(groups={GroupOrder1.class},message="ユーザIDを入力してください。")
	private String custid;
	@NotEmpty(groups={GroupOrder1.class},message="ユーザ名を入力してください。")
	private String custname;
	@NotEmpty(groups={GroupOrder1.class},message="組織名を入力してください。")
	private String orgname;
	@NotEmpty(groups={GroupOrder1.class},message="パスワードを入力してください。")
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
