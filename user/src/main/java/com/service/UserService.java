package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findById(Integer id);
}
