package com.weishubin.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weishubin.bbs.dao.UserPlanMapper;
import com.weishubin.bbs.domain.UserPlan;

@Service
public class UserPlanService {
	@Autowired
	private UserPlanMapper userPlanMapper;
	
	

	public List<UserPlan> getUserPlanList(int activityId) {
		return userPlanMapper.getUserPlanList(activityId);
	}
	
	public UserPlan getUserStatus(int userId, int activityId) {
		UserPlan p = new UserPlan();
		p.setUserId(userId);
		p.setActivityId(activityId);
		return userPlanMapper.getUserPlan(p);
	}
	
	@Transactional
	public UserPlan saveUserStatus(UserPlan userPlan) {
		UserPlan p = userPlanMapper.getUserPlan(userPlan);
		if (p == null) { //a new user plan
			userPlanMapper.insertUserPlan(userPlan);
		} else {
			userPlan.setPlanId(p.getPlanId());
			userPlanMapper.updateUserPlan(userPlan);
		}
		
		return userPlanMapper.getUserPlan(userPlan);
	}
	
	

	public void setUserPlanMapper(UserPlanMapper userPlanMapper) {
		this.userPlanMapper = userPlanMapper;
	}
}
