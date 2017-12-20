package jp.co.gyosei.botlog;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import jp.co.gyosei.botlog.domain.entity.LoginCustinfoEntityImpl;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

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
    public String role;
    
    // 独自で必要な項目
    //public String auth;

    public LoginCust(LoginCustinfoEntityImpl cust) {
        super(cust.custid, cust.password, new ArrayList<GrantedAuthority>());
        custid = cust.custid;
        password = cust.password;
        role = cust.role;
        //auth = cust.auth;
    }
}