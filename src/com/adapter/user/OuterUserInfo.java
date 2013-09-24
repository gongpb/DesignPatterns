package com.adapter.user;

import java.util.HashMap;
import java.util.Map;

/**
 * 中转角色(类适配器)
 * @author gong_pibao
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
	private Map baseInfoMap = super.getUserBaseInfo(); //员工基本信息
	private Map homeInfoMap = new HashMap();		//家庭信息
	private Map officeInfoMap = new HashMap();      //工作信息
	//家庭地址
	@Override
	public String getHomeAddress() {
		String homeAddress = (String) this.baseInfoMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}
	//家庭电话
	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String) this.homeInfoMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}
	//工作职位
	@Override
	public String getJobPosition() {
		String jobPosition = (String) this.officeInfoMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}
	//办公电话
	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = (String) this.officeInfoMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}
	//手机号码
	@Override
	public String getMobileNumber() {
		String mobileNumber = (String) this.baseInfoMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}
	//用户姓名
	@Override
	public String getUserName() {
		String userName = (String) this.baseInfoMap.get("userName");
		System.out.println(userName);
		return userName;
	}

}
