package com.adapter.user;

import java.util.HashMap;
import java.util.Map;

/**
 * �������˾ʵ����
 * @author gong_pibao
 */
public class OuterUser implements IOuterUser{

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "����˾---���Ա��������");
		baseInfoMap.put("mobileNumber", "����˾---���Ա���ĵ绰��15010-----");
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap = new HashMap();
		homeInfoMap.put("homeTelNumber", "����˾---Ա����ͥ�绰��-----");
		homeInfoMap.put("homeAddress", "����˾---Ա����ͥ��ַ��-----");
		return homeInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap = new HashMap();
		officeInfoMap.put("jobPosition", "����˾---Ա��ְλ��---");
		officeInfoMap.put("officeTelNumber", "����˾---Ա���칫�绰��---");
		return officeInfoMap;
	}

}
