package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * ������ (����������)
 * ���������ί�з��񣬰�IUserInfo�ӿ��е����в��� ���������������ӿ��µ�ʵ���࣬
 * ����ί����ͨ�������εĹ�����ϵ����ί�У������Ǽ̳й�ϵ
 * @author gong_pibao
 */
public class OuterUserInfo implements IUserInfo{
	//ԴĿ�����
	private IOuterUserBaseInfo 	 baseInfo   = null; //������Ϣ
	private IOuterUserHomeInfo 	 homeInfo   = null; //��ͥ��Ϣ
	private IOuterUserOfficeInfo officeInfo = null; //�칫��Ϣ
	//���ݴ���
	private Map baseInfoMap = null; //Ա��������Ϣ
	private Map homeInfoMap = null;		//��ͥ��Ϣ
	private Map officeInfoMap = null;      //������Ϣ
	
	public OuterUserInfo(IOuterUserBaseInfo baseInfo,IOuterUserHomeInfo  homeInfo, 
			IOuterUserOfficeInfo officeInfo ){
		this.baseInfo   = baseInfo;
		this.homeInfo   = homeInfo;
		this.officeInfo = officeInfo;
		//���ݴ���
		this.baseInfoMap  = this.baseInfo.getUserBaseInfo();
		this.homeInfoMap  = this.homeInfo.getUserHomeInfo();
		this.officeInfoMap= this.officeInfo.getUserOfficeInfo();
	}
	
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
