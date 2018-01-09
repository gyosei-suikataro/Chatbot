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

	public LoginUserDetails(String custid, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> role) {
		super(custid, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, role);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private static final long serialVersionUID = 1L;

	// 追加する（テーブルでユーザーのキーとなる値を設定する）
	public String custid;

	// 追加する
	public String password;

	// 追加する
	public Collection<? extends GrantedAuthority> role;
	
    public LoginUserDetails(CustinfoEntityImpl cust) {
    	super(cust.custid, cust.password, true, true, true, true, new ArrayList<GrantedAuthority>());
        custid = cust.custid;
        password = cust.password;
        role = cust.role;
    }
	
}
