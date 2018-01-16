package jp.co.gyosei.botlog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jp.co.gyosei.botlog.domain.entity.MyUserDetails;
@Repository
public interface LoginRepository extends JpaRepository<MyUserDetails, String>{
	public static MyUserDetails findByCustid(String custid) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}