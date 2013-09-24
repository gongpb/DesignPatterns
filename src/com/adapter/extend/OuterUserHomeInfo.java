package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo {

	@Override
	public Map getUserHomeInfo() {
		HashMap homeInfoMap = new HashMap();
		homeInfoMap.put("homeTelNumber", "劳务公司---员工家庭电话是-----");
		homeInfoMap.put("homeAddress", "劳务公司---员工家庭地址是-----");
		return homeInfoMap;
	}

}
