package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap = new HashMap();
		officeInfoMap.put("jobPosition", "劳务公司---员工职位是---");
		officeInfoMap.put("officeTelNumber", "劳务公司---员工办公电话是---");
		return officeInfoMap;
	}

}
