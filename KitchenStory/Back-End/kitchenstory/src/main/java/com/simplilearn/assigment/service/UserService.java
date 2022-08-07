package com.simplilearn.assigment.service;

import java.util.List;

import com.simplilearn.assigment.model.User;

public interface UserService {
	public List<User> findAll();
	public void deleteById(long theUser);
	public User findById(long theUser);
	public User save(User theUser);
}
