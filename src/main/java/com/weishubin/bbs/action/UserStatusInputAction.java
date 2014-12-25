package com.weishubin.bbs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.domain.Activity;
import com.weishubin.bbs.domain.UserPlan;
import com.weishubin.bbs.service.ActivityService;
import com.weishubin.bbs.service.UserPlanService;
import com.weishubin.bbs.util.R;

@Controller
public class UserStatusInputAction extends ActionSupport implements SessionAware {
	
	private Map<String, Object> session;
	
	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private UserPlanService userPlanService;
	
	//need userId, activityId, planType, planId
	private UserPlan userStatus;
	
	private Activity activity;
	
	public String execute() throws Exception {
		activity = activityService.getCurrentActivity();
		if (activity != null) {
			Integer userId = (Integer) session.get(R.USER_ID);
			userStatus = userPlanService.getUserStatus(userId, activity.getId());
		}
		
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	
	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
	
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	public void setUserPlanService(UserPlanService userPlanService) {
		this.userPlanService = userPlanService;
	}
	
	public UserPlan getUserStatus() {
		return userStatus;
	}
	
	
	
}
