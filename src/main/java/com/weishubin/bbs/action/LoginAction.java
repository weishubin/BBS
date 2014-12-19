package com.weishubin.bbs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.service.UserService;


public class LoginAction extends ActionSupport {
	
	private UserService userServer;
	
	public UserService getUserServer() {
		return userServer;
	}

	public void setUserServer(UserService userServer) {
		this.userServer = userServer;
	}

	public String welcome() throws Exception {
        
	    return SUCCESS;
	 
	}
	
	public String execute() throws Exception {
	         
	    return SUCCESS;
	 
	}
	 
}
