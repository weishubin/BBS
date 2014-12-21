package com.weishubin.bbs.domain;

import java.io.Serializable;

public class UserPlan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2357104466790568809L;
	private int planId;
	private int planType;
	private int activityId;
	private int userId;
	private String userName;

	
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getPlanType() {
		return planType;
	}
	public void setPlanType(int planType) {
		this.planType = planType;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	}
