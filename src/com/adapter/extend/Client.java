package com.adapter.extend;

public class Client {
	public static void main(String[] args) {
		//外系统的人员信息
		IOuterUserBaseInfo 	 baseInfo   = new OuterUserBaseInfo() ; //基本信息
		IOuterUserHomeInfo 	 homeInfo   = new OuterUserHomeInfo() ; //家庭信息
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo(); //办公信息
		IUserInfo userInfo = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
		for(int i=0; i<5; i++){
			userInfo.getMobileNumber();
		}
	}
}
