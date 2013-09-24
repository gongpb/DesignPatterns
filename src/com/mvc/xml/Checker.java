package com.mvc.xml;

import java.util.Observable;
import java.util.Observer;
	/**
	 * 策略类
	 * @author gongpeibao
	 */
public class Checker implements Observer{
	//使用哪个策略
	private IXmlValidate validate;
	private String xmlPath; //xml路径
	public Checker(){
		
	}
	//构造方法
	public Checker(IXmlValidate validate){
		this.validate = validate;
	}
	//设置xml路径
	public void setXmlPath(String xmlPath) {
		this.xmlPath = xmlPath;
	}
	//检查
	public boolean check(){
		return this.validate.validate(xmlPath);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("检测到变化-----------------");
	}
}
