package com.weishubin.bbs.action;

import java.util.List;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.dao.UserPlanMapper;
import com.weishubin.bbs.domain.Activity;
import com.weishubin.bbs.domain.User;
import com.weishubin.bbs.domain.UserPlan;
import com.weishubin.bbs.service.ActivityService;
import com.weishubin.bbs.service.UserPlanService;
import com.weishubin.bbs.util.R;

@Controller
public class ShowUserPlanAction extends ActionSupport {
	@Autowired
	private UserPlanService userPlanService;
	@Autowired
	private ActivityService activityService;
	
	
	private Activity activity;
	private List<UserPlan> userPlanList;
	
	public List<UserPlan> getUserPlanList() {
		return userPlanList;
	}

	public void setUserPlanList(List<UserPlan> userPlanList) {
		this.userPlanList = userPlanList;
	}

	public UserPlanService getUserPlanService() {
		return userPlanService;
	}

	public void setUserPlanService(UserPlanService userPlanService) {
		this.userPlanService = userPlanService;
	}

	public ActivityService getActivityService() {
		return activityService;
	}

	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public String execute() throws Exception {
		activity = activityService.getActivity();
		if (activity != null) {
			userPlanList = userPlanService.getUserPlanList(activity.getId());
		}
		
	    return SUCCESS;
	 
	}

}
