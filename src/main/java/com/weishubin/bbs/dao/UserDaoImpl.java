package com.weishubin.bbs.dao;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.weishubin.bbs.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	public User getUser(String userNo) {
		User user = new User();
		user.setUserId(1);
		user.setUserNo("wei_shubin");
		user.setUserName("魏书斌");
		user.setLastLoginTime(new Date());;
		
		return user;
		
	}

}
