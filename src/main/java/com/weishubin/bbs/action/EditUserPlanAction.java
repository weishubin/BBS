package com.weishubin.bbs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.domain.UserPlan;


public class EditUserPlanAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
	
	//need userId, activityId, planType, planId
	private UserPlan userPlan;
	
	public String execute() throws Exception {
		
		
		return SUCCESS;
	}
	
	public UserPlan getUserPlan() {
		return userPlan;
	}

	public void setUserPlan(UserPlan userPlan) {
		this.userPlan = userPlan;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	
	
	
}
