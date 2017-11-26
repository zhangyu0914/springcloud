package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}

	@Override
	public User findById(Integer id) {
		User user = userMapper.findById(id);
		return user;
	}

}
