package com.adapter.user;

import java.util.HashMap;
import java.util.Map;

/**
 * 劳务服务公司实现类
 * @author gong_pibao
 */
public class OuterUser implements IOuterUser{

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "劳务公司---这个员工叫王五");
		baseInfoMap.put("mobileNumber", "劳务公司---这个员工的电话是15010-----");
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap = new HashMap();
		homeInfoMap.put("homeTelNumber", "劳务公司---员工家庭电话是-----");
		homeInfoMap.put("homeAddress", "劳务公司---员工家庭地址是-----");
		return homeInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap = new HashMap();
		officeInfoMap.put("jobPosition", "劳务公司---员工职位是---");
		officeInfoMap.put("officeTelNumber", "劳务公司---员工办公电话是---");
		return officeInfoMap;
	}

}
