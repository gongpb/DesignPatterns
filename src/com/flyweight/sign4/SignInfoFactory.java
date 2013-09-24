package com.flyweight.sign4;

import java.util.HashMap;
/**
 * 报考信息工厂
 * @author gong_pibao
 */
public class SignInfoFactory {
	//容器池
	private static HashMap<ExtrisicState, SignInfo> pool = new HashMap<ExtrisicState, SignInfo>();
	
	//从池中获取对象
	public static SignInfo getSignInfo(ExtrisicState key){
		//返回对象
		SignInfo result = null;
		//池中没有对象，则建立，并放入池中
		if(!pool.containsKey(key))
		{
			result = new SignInfo();
			pool.put(key, result);
		}
		else
		{
			result = pool.get(key);
			System.out.println(key+"------直接冲池中取得");
		}
		return result;
	}
}
