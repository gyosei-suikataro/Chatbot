/*
package jp.co.gyosei.botlog;

import java.util.ArrayList;
import java.util.Collection;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LoginUserDetails extends User {

	private static final long serialVersionUID = 1L;
	private final CustinfoEntityImpl customer; // (2)

	public LoginUserDetails(CustinfoEntityImpl customer) {
		super(customer.getCustid(),
				customer.getPassword(), true, true, true, true, customer.role); 
		this.customer = customer;
	}

	public CustinfoEntityImpl getCustomer() { // (5)
		return customer;
	}
}
*/