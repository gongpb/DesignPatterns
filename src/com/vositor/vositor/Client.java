package com.vositor.vositor;

/**
 * ������ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
		{
			//���Ԫ�ض���
			Element e1 = ObjectStruture.createElement();
			//���ܷ����߷���
			e1.accept(new Visitor());
		}
	}
}
