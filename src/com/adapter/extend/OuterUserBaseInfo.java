package com.adapter.extend;

import java.util.HashMap;
import java.util.Map;

public class OuterUserBaseInfo implements IOuterUserBaseInfo{

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap();
		baseInfoMap.put("userName", "����˾---���Ա��������");
		baseInfoMap.put("mobileNumber", "����˾---���Ա���ĵ绰��15010-----");
		return baseInfoMap;
	}

}
