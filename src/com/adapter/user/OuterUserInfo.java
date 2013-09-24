package com.adapter.user;

import java.util.HashMap;
import java.util.Map;

/**
 * ��ת��ɫ(��������)
 * @author gong_pibao
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
	private Map baseInfoMap = super.getUserBaseInfo(); //Ա��������Ϣ
	private Map homeInfoMap = new HashMap();		//��ͥ��Ϣ
	private Map officeInfoMap = new HashMap();      //������Ϣ
	//��ͥ��ַ
	@Override
	public String getHomeAddress() {
		String homeAddress = (String) this.baseInfoMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}
	//��ͥ�绰
	@Override
	public String getHomeTelNumber() {
		String homeTelNumber = (String) this.homeInfoMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}
	//����ְλ
	@Override
	public String getJobPosition() {
		String jobPosition = (String) this.officeInfoMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}
	//�칫�绰
	@Override
	public String getOfficeTelNumber() {
		String officeTelNumber = (String) this.officeInfoMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}
	//�ֻ�����
	@Override
	public String getMobileNumber() {
		String mobileNumber = (String) this.baseInfoMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}
	//�û�����
	@Override
	public String getUserName() {
		String userName = (String) this.baseInfoMap.get("userName");
		System.out.println(userName);
		return userName;
	}

}
