package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private EurekaClient discoveryClient;

	@RequestMapping("/findAll")
	public List<User> findAll() {
		List<User> list = userService.findAll();
		return list;
	}
	
	@RequestMapping("/findById")
	public User findById(Integer id) {
		User user = userService.findById(id);
		return user;
	}
	
	@RequestMapping("/eureka")
	public String serviceUrl() {
	    InstanceInfo instance = discoveryClient.getNextServerFromEureka("user", false);
	    return instance.getHomePageUrl();
	}
}
