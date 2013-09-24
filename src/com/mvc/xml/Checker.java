package com.mvc.xml;

import java.util.Observable;
import java.util.Observer;
	/**
	 * ������
	 * @author gongpeibao
	 */
public class Checker implements Observer{
	//ʹ���ĸ�����
	private IXmlValidate validate;
	private String xmlPath; //xml·��
	public Checker(){
		
	}
	//���췽��
	public Checker(IXmlValidate validate){
		this.validate = validate;
	}
	//����xml·��
	public void setXmlPath(String xmlPath) {
		this.xmlPath = xmlPath;
	}
	//���
	public boolean check(){
		return this.validate.validate(xmlPath);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��⵽�仯-----------------");
	}
}
