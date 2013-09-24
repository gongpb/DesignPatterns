package com.vositor.vositor;

/**
 * 访问者模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
		{
			//获得元素对象
			Element e1 = ObjectStruture.createElement();
			//接受访问者访问
			e1.accept(new Visitor());
		}
	}
}
