package com.adapter.user;

public class Client {
	public static void main(String [] args){
		//没有与外部连接，本公司员工信息
//		IUserInfo yangGirl = new UserInfo();
//		for(int i=0; i<10; i++){
//			yangGirl.getMobileNumber();
//		}
		
		//查看劳务公司的员工信息
		IUserInfo yangGirlOuter = new OuterUserInfo();
		for(int i=0; i<10; i++){
			yangGirlOuter.getMobileNumber();
		}
	}

}
