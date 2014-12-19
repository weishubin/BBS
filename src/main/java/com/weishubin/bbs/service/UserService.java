package com.weishubin.bbs.service;

import com.weishubin.bbs.model.User;

public interface UserService {
	public User login(String usrNo, String pwd);
}
