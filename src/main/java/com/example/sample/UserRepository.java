package com.example.sample;

import com.example.sample.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}

