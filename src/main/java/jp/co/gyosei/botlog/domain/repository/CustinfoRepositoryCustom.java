package jp.co.gyosei.botlog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.gyosei.botlog.LoginCust;

@Repository
public interface CustinfoRepositoryCustom extends JpaRepository<LoginCust, String>{

	public static LoginCust findByCustid(String custid) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
