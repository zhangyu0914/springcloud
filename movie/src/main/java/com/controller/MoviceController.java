package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.entity.User;

@RestController
@RequestMapping("/movice")
public class MoviceController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/findById") 
	public User findById(Integer id) {
		return this.restTemplate.getForObject("http://user/user/findById?id=" + id, User.class);
	}
}
