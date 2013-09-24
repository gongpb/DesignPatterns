package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 适配器 (对象适配器)
 * 这个类变成了委托服务，把IUserInfo接口中的所有操作 都交给其他三个接口下的实现类，
 * 它的委托是通过对象层次的关联关系进行委托，而不是继承关系
 * @author gong_pibao
 */
public class OuterUserInfo implements IUserInfo{
	//源目标对象
	private IOuterUserBaseInfo 	 baseInfo   = null; //基本信息
	private IOuterUserHomeInfo 	 homeInfo   = null; //家庭信息
	private IOuterUserOfficeInfo officeInfo = null; //办公信息
	//数据处理
	private Map baseInfoMap = null; //员工基本信息
	private Map homeInfoMap = null;		//家庭信息
	private Map officeInfoMap = null;      //工作信息
	
	public OuterUserInfo(IOuterUserBaseInfo baseInfo,IOuterUserHomeInfo  homeInfo, 
			IOuterUserOfficeInfo officeInfo ){
		this.baseInfo   = baseInfo;
		this.homeInfo   = homeInfo;
		this.officeInfo = officeInfo;
		//数据处理
		this.baseInfoMap  = this.baseInfo.getUserBaseInfo();
		this.homeInfoMap  = this.homeInfo.getUserHomeInfo();
		this.officeInfoMap= this.officeInfo.getUserOfficeInfo();
	}
	
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
