package jp.co.gyosei.botlog;

import jp.co.gyosei.botlog.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser, String>{

	LoginUser findOne(String custid);

}