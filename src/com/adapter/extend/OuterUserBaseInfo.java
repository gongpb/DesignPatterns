package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "劳务公司---这个员工叫王五");
		baseInfoMap.put("mobileNumber", "劳务公司---这个员工的电话是15010-----");
		return baseInfoMap;
	}

}
