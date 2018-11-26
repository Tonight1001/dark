package com.leo.service;

import com.leo.po.User;

public interface UserService {
	User login(String userName,String password);
}
