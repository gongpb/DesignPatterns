package com.flyweight.sign;
/**
 * 报考信息工厂
 * @author gong_pibao
 */
public class SignInfoFactory {
	//报考信息的对象工厂
	public static SignInfo getSignInfo(){
		return new SignInfo();
	}
}
