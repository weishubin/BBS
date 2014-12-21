package com.weishubin.bbs.domain;

import java.io.Serializable;


public class Activity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2391522618262895193L;
	private int id;
	private String name;
	private String startTimeStr;
	private String endTimeStr;
	private String place;
	private int state;
	public String getEndTimeStr() {
		return endTimeStr;
	}
	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartTimeStr() {
		return startTimeStr;
	}
	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	}
