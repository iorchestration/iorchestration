package com.i.orchestration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.i.orchestration.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
