package jp.co.gyosei.botlog.domain.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
@Entity
@Table(name="custinfo") 
public class MyUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue 
	private String custid;
	@Column(nullable = false) 
	private String custname; 
	@Column(nullable = false) 
	private String password;
	@Column(nullable = false) 
	private Boolean effect; 
	@Column(nullable = false) 
	private String role;
	
	public Collection<GrantedAuthority> getAuthorities() { 
		List<GrantedAuthority> authorities = new ArrayList<>(); 
		authorities.add(new SimpleGrantedAuthority(role)); 
		return authorities; 
	}

	@Override
	public String getPassword() {
		return this.password;
	}
	@Override
	public String getUsername() {
		return this.custid;
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