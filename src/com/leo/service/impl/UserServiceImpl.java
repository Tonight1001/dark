package com.leo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.leo.mapper.UserMapper;
import com.leo.po.User;
import com.leo.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User login(String userName, String password) {
		// TODO Auto-generated method stub
		return userMapper.login(userName, password);
	}

}
