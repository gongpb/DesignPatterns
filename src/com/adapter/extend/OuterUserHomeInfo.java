package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap = new HashMap();
		homeInfoMap.put("homeTelNumber", "����˾---Ա����ͥ�绰��-----");
		homeInfoMap.put("homeAddress", "����˾---Ա����ͥ��ַ��-----");
		return homeInfoMap;
	}

}
