package com.weishubin.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weishubin.bbs.dao.UserDao;
import com.weishubin.bbs.model.User;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(String usrNo, String pwd) {
		User user = userDao.getUser(usrNo);
		if (user == null) {
			return null;
		} else {
			return user;
		}
	}

}
