package com.mvc.xml;
/**
 * 策略 逻辑验证
 * @author gongpeibao
 */
public class LogicXmlValidate implements IXmlValidate{
	//对xml进行逻辑验证  如 配置的方法不存在
	@Override
	public boolean validate(String xmlPath) {
		return false;
	}
	
	
}
