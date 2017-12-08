package com.example.sample;

import com.example.sample.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public Page<User> UserfindAll(Pageable pageable);
	
}

