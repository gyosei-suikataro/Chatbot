package jp.co.gyosei.botlog.domain.form;

public class LoginForm {

	private String custid;
	private String password;
	
	 String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}