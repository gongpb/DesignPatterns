package com.adapter.user;

/**
 * ʵ����
 * @author gong_pibao
 */
public class UserInfo implements IUserInfo{

	@Override
	public String getHomeAddress() {
		System.out.println("��ͥ��ַ��ɽ��-----");
		return null;
	}

	@Override
	public String getHomeTelNumber() {
		System.out.println("��ͥ�绰��05-----");
		return null;
	}

	@Override
	public String getJobPosition() {
		System.out.println("����ְλ��java����ʦ------");
		return null;
	}

	@Override
	public String getMobileNumber() {
		System.out.println("�ֻ�������15010-----");
		return null;
	}

	@Override
	public String getOfficeTelNumber() {
		System.out.println("�칫�绰��------");
		return null;
	}

	@Override
	public String getUserName() {
		System.out.println("������------");
		return null;
	}

}
