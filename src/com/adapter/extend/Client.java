package com.adapter.extend;

public class Client {
	public static void main(String[] args) {
		//��ϵͳ����Ա��Ϣ
		IOuterUserBaseInfo 	 baseInfo   = new OuterUserBaseInfo() ; //������Ϣ
		IOuterUserHomeInfo 	 homeInfo   = new OuterUserHomeInfo() ; //��ͥ��Ϣ
		IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo(); //�칫��Ϣ
		IUserInfo userInfo = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
		for(int i=0; i<5; i++){
			userInfo.getMobileNumber();
		}
	}
}
