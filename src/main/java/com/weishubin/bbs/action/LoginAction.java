package com.weishubin.bbs.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.model.User;
import com.weishubin.bbs.service.UserService;


@Controller
public class LoginAction extends ActionSupport {
	

	@Autowired
	private UserService userSerivce;
	
	private User user;

	public UserService getUserSerivce() {
		return userSerivce;
	}

	public void setUserSerivce(UserService userSerivce) {
		this.userSerivce = userSerivce;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String welcome() throws Exception {
        
	    return SUCCESS;
	 
	}
	
	public String execute() throws Exception {
		
		User u = userSerivce.login(user.getUserNo(), user.getPwd());
		if (u == null) {
			return ERROR;
		}
		
		this.setUser(u);
	         
	    return SUCCESS;
	 
	}
	 
}
