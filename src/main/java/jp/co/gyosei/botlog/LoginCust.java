package jp.co.gyosei.botlog;

import java.util.ArrayList;
import java.util.Collection;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
//import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import jp.co.gyosei.botlog.impl.CustinfoEntityImpl;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class LoginCust extends User {

    private static final long serialVersionUID = 1L;

    // 追加する（テーブルでユーザーのキーとなる値を設定する）
    public String custid;

    // 追加する
    public String password;

    // 追加する
    public Collection<GrantedAuthority> role;

    public LoginCust(CustinfoEntityImpl cust) {
    	super(cust.custid, cust.password, true, true, true, true, cust.role);
        custid = cust.custid;
        password = cust.password;
        role = cust.role;
    }
    
    public Collection<GrantedAuthority> getAuthorities() {
        // TODO 自動生成されたメソッド・スタブ
        return role;
    }
}