package com.flyweight.sign2;

import java.util.HashMap;
/**
 * 报考信息工厂
 * @author gong_pibao
 */
public class SignInfoFactory {
	//容器池
	private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();
	//报考信息的对象工厂
	@Deprecated
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
	//从池中获取对象
	public static SignInfo getSignInfo(String key){
		//返回对象
		SignInfo result = null;
		//池中没有对象，则建立，并放入池中
		if(!pool.containsKey(key))
		{
			System.out.println(key+"------建立对象，并放入池中 ");
			result = new SignInfo4Pool(key);
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
