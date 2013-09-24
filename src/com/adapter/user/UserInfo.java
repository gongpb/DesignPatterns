package com.adapter.user;

/**
 * 实现类
 * @author gong_pibao
 */
public class UserInfo implements IUserInfo{

	@Override
	public String getHomeAddress() {
		System.out.println("家庭地址是山东-----");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("家庭电话是05-----");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("工作职位是java工程师------");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("手机号码是15010-----");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("办公电话是------");
		return null;
	}

	@Override
	public String getUserName() {
		System.out.println("姓名叫------");
		return null;
	}

}
