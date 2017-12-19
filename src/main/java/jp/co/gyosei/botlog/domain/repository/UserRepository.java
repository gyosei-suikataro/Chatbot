package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByCustid(String custid);
	
}
