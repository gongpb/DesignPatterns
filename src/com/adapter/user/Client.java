package com.adapter.user;

public class Client {
	public static void main(String [] args){
		//û�����ⲿ���ӣ�����˾Ա����Ϣ
//		IUserInfo yangGirl = new UserInfo();
//		for(int i=0; i<10; i++){
//			yangGirl.getMobileNumber();
//		}
		
		//�鿴����˾��Ա����Ϣ
		IUserInfo yangGirlOuter = new OuterUserInfo();
		for(int i=0; i<10; i++){
			yangGirlOuter.getMobileNumber();
		}
	}

}
