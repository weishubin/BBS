package com.weishubin.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weishubin.bbs.dao.UserMapper;
import com.weishubin.bbs.domain.User;
import com.weishubin.bbs.util.MD5Util;

@Service
public class UserService {

	@Autowired
	private UserMapper userDao;

	public UserMapper getUserDao() {
		return userDao;
	}

	public void setUserDao(UserMapper userDao) {
		this.userDao = userDao;
	}

	public User login(String usrNo, String pwd) {
		User user = userDao.getUser(usrNo);
		if (user == null) {
			return null;
		} else {
			if (user.getPwd().equalsIgnoreCase(MD5Util.MD5(pwd))) {
				return user;
			} else
				return null;
		}
	}

}
