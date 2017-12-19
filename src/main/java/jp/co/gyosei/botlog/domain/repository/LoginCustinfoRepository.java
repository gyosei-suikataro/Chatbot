package jp.co.gyosei.botlog.domain.repository;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginCustinfoRepository extends JpaRepository<CustinfoEntity, String>{

	LoginCustinfoRepository authLoginCustinfoRepository(String custid, String password);

}
