package com.weishubin.bbs.dao;

import java.util.List;

import com.weishubin.bbs.domain.UserPlan;

public interface UserPlanMapper {
	public List<UserPlan> getUserPlanList(int activityId);
}
