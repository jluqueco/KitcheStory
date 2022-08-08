package com.simplilearn.assigment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assigment.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
