package com.weishubin.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weishubin.bbs.dao.UserPlanMapper;
import com.weishubin.bbs.domain.UserPlan;

@Service
public class UserPlanService {
	@Autowired
	private UserPlanMapper userPlanMapper;
	
	public UserPlanMapper getUserPlanMapper() {
		return userPlanMapper;
	}

	public void setUserPlanMapper(UserPlanMapper userPlanMapper) {
		this.userPlanMapper = userPlanMapper;
	}

	public List<UserPlan> getUserPlanList(int activityId) {
		return userPlanMapper.getUserPlanList(activityId);
	}
}
