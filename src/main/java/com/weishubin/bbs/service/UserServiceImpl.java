package com.weishubin.bbs.service;

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
		return new User();
	}

}
