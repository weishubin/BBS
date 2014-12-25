package com.weishubin.bbs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.domain.UserPlan;
import com.weishubin.bbs.service.UserPlanService;
import com.weishubin.bbs.util.R;

@Controller
public class SaveUserStatusAction extends ActionSupport  implements SessionAware {
	private static final long serialVersionUID = -1719300928873669610L;
	
	private Integer activityId;
	private Integer planType;
	

	private Map<String, Object> session;
	@Autowired
	private UserPlanService userPlanService;
	
	private int result;


	public int getResult() {
		return result;
	}


	public String execute() throws Exception {
		Integer userId = (Integer) session.get(R.USER_ID);
		
		UserPlan status = new UserPlan();
		status.setActivityId(activityId);
		status.setUserId(userId);
		status.setPlanType(planType);
		
		userPlanService.saveUserStatus(status);
		
		result = 1;//成功
		
		return SUCCESS;
	}
	
	
	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}
	
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	
	public void setUserPlanService(UserPlanService userPlanService) {
		this.userPlanService = userPlanService;
	}
	public void setPlanType(Integer planType) {
		this.planType = planType;
	}
}
