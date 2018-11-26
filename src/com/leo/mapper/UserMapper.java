package com.leo.mapper;

import com.leo.po.User;

public interface UserMapper {
	User login(String userName,String password);
}
