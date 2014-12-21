package com.weishubin.bbs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.domain.User;
import com.weishubin.bbs.service.UserService;
import com.weishubin.bbs.util.R;


@Controller
public class LoginAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	
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
		if (user == null) {
			return INPUT;
		}
		User u = userSerivce.login(user.getUserNo(), user.getPwd());
		if (u == null) {
			return INPUT;
		}
		
		this.setUser(u);
		
		//store user info in session
		session.put(R.USER_ID, u.getUserId());
		session.put(R.USER_NAME, u.getUserName());
	         
	    return SUCCESS;
	 
	}

	public void setSession(Map<String, Object> s) {
		this.session = s;
	}
	 
}
