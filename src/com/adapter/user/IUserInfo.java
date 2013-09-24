package com.adapter.user;

/**
 * 员工信息接口
 * @author gong_pibao
 */
public interface IUserInfo {
	//获取用户姓名
	public String getUserName();
	//获取家庭地址
	public String getHomeAddress();
	//获取手机号码
	public String getMobileNumber();
	//获取办公电话
	public String getOfficeTelNumber();
	//获取工作职位
	public String getJobPosition();
	//获取家庭电话
	public String getHomeTelNumber();
}
