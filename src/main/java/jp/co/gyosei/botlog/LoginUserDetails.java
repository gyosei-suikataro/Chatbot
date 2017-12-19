/*
package jp.co.gyosei.botlog;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import antlr.collections.List;
import jp.co.gyosei.botlog.LoginUser;
import jp.co.gyosei.botlog.domain.entity.User;

public class LoginUserDetails implements UserDetails {
 	
	private int no;
    private String custid;
    private String custname;
    private String orgname;
    private String password;
    private String effect;
    private Collection<GrantedAuthority> role;

    public LoginUserDetails(int no, String custid, String custname, String orgname, String password,
            String effect, Collection<GrantedAuthority> role) {
        super();
        this.no = no;
        this.custid = custid;
        this.custname = custname;
        this.orgname = orgname;
        this.password = password;
        this.effect = effect;
        this.role = role;
    }

    public static UserDetails create(User entity) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for(User auth: entity.getRole()){
            authorities.add(new SimpleGrantedAuthority(auth.getId().getAuthority()));
        }
        return new MyUserDetail(entity.getId(), entity.getLoginId(), entity.getPassword(), entity.getName(), authorities);
    }

    public int getNo(){
        return this.no;
    }

    public String getCustid(){
        return this.custid;
    }
    
    public String getCustname(){
        return this.custname;
    }
    
    public String getOrgname(){
        return this.orgname;
    }
    
    public String getPassword(){
        return this.password;
    }

    public String getEffect(){
        return this.effect;
    }
    
    public Collection<? extends GrantedAuthority> getRole() {
        return this.role;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
*/