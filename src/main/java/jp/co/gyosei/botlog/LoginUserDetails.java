package jp.co.gyosei.botlog;

import java.util.Collections;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

public class LoginUserDetails extends User { // (1)
	// omitted

	private final CustinfoEntityImpl customer; // (2)
	/*
    private static final List<? extends GrantedAuthority> DEFAULT_AUTHORITIES = Collections
            .singletonList(new SimpleGrantedAuthority("ROLE_USER"));         // (3)
	 */
	public LoginUserDetails(CustinfoEntityImpl customer) {
		super(); // (4)
		this.customer = customer;
	}

	public CustinfoEntityImpl getCustomer() { // (5)
		return customer;
	}
}