package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.entity.User;

@Mapper
public interface UserMapper {
	
	@Select("select id, userName, name, age, balance from User")
	public List<User> findAll();
	
	@Select("select id, userName, name, age, balance from User where id=#{id}")
	public User findById(Integer id);
}
