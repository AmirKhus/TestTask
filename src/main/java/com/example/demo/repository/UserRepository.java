package com.example.demo.repository;

import com.example.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
    List<Users> findOrOrderByPostId(Long postId);

    List<Users> findOrderByBirthday(Date birthday);

    List<Users> findByPostId(Long id);
}
