package com.weishubin.bbs.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Inject;
import com.weishubin.bbs.model.User;
import com.weishubin.bbs.service.UserService;


@Controller
public class LoginAction extends ActionSupport {
	

	private UserService userSerivce;
	
	private User user;

	public UserService getUserSerivce() {
		return userSerivce;
	}

	@Inject
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
