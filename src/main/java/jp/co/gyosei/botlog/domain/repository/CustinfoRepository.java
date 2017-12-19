package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustinfoRepository extends JpaRepository<CustinfoEntity, Integer>{

	CustinfoRepository authCustinfoRepository(String custid, String password);
	
}
