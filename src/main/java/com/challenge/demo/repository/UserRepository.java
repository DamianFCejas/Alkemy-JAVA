package com.challenge.demo.repository;

import com.challenge.demo.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> findByEmail(String username);
    
}
