package jp.co.gyosei.botlog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import jp.co.gyosei.botlog.domain.repository.CustinfoRepositoryCustom;

@Component
public class UserDetailsServiceImpl implements UserDetailsService  {

    @Autowired
    private CustinfoRepositoryCustom custinfoRepositoryCustom;

    /* (非 Javadoc)
    * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserBycustid(java.lang.String)
    */
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        if ( username == null || username.isEmpty() ){
            throw new UsernameNotFoundException("custid is empty");
        }

        CustinfoEntityImpl foundUser = custinfoRepositoryCustom.findByCustid(username);
        if( foundUser != null ){
            return foundUser.toLoginUserDetails();
        }
        throw new UsernameNotFoundException( username + "is not found");
    }
}
