package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{

	@Override
	public Map getUserOfficeInfo() {
		HashMap officeInfoMap = new HashMap();
		officeInfoMap.put("jobPosition", "����˾---Ա��ְλ��---");
		officeInfoMap.put("officeTelNumber", "����˾---Ա���칫�绰��---");
		return officeInfoMap;
	}

}
