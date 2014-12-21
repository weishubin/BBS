package com.weishubin.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weishubin.bbs.dao.UserMapper;
import com.weishubin.bbs.domain.User;

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

	@Transactional
	public User login(String usrNo, String pwd) {
		User user = userDao.getUser(usrNo);
		if (user == null) {
			return null;
		} else {
			return user;
		}
	}

}
