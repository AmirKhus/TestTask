package com.example.demo.repository;

import com.example.demo.entity.InformationForUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InformationForUserRepository extends JpaRepository<InformationForUser, Long> {
    List<InformationForUser> findAll();

    InformationForUser findByUserId(Long id);
}
