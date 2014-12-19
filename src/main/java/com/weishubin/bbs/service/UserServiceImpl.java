package com.weishubin.bbs.service;

import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.inject.Inject;
import com.weishubin.bbs.dao.UserDao;
import com.weishubin.bbs.model.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Inject
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(String usrNo, String pwd) {
		User user = userDao.getUser(usrNo);
		if (user == null) {
			return null;
		} else {
			if (user.getPwd().equals(pwd)) {
				return user;
			} else {
				return null;
			}
		}
	}

}
