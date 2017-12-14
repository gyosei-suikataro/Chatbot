package jp.co.gyosei.botlog;

import jp.co.gyosei.botlog.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUserRepository extends JpaRepository<LoginUser, String>{

	//test
	/*
	LoginUser $missing$(String custid);
	*/
	//test
	LoginUser findOne(String custid);
	
}

