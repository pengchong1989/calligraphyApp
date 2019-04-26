/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.calligraphy.dto;

import java.util.Date;

/**
 * app用户Entity
 * @author keepc
 * @version 2019-01-01
 */
public class AppUser{

	private String id;
	private String username;		// 用户名
	private Agent agent;		// 代理商id
	private String unit;		// 单位
	private String phone;		// 电话
	private String email;		// 邮箱
	private String usertype;		// 用户类型
	private AppUser appUser;		// 所属老师id
	private String status;		// 用户状态
	private Date onlinetime;		// 最后在线时间
	private Date starttime;		// 有效期开始时间
	private Date endtime;		// 有效期结束时间
	private String code;
    private Integer hasActived;//是否激活过
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getOnlinetime() {
		return onlinetime;
	}

	public void setOnlinetime(Date onlinetime) {
		this.onlinetime = onlinetime;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

    public Integer getHasActived() {
        return hasActived;
    }

    public void setHasActived(Integer hasActived) {
        this.hasActived = hasActived;
    }
}