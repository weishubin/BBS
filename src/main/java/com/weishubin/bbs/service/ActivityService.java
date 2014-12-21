package com.weishubin.bbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weishubin.bbs.dao.ActivityMapper;
import com.weishubin.bbs.domain.Activity;

@Service
public class ActivityService {
	@Autowired
	private ActivityMapper activityMapper;
	
	public ActivityMapper getActivityMapper() {
		return activityMapper;
	}

	public void setActivityMapper(ActivityMapper activityMapper) {
		this.activityMapper = activityMapper;
	}

	public Activity getActivity() {
		return activityMapper.getActivity();
	}
}