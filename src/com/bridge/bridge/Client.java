package com.bridge.bridge;
/**
 * ����ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//����һ����ʵ�ֻ���ɫ
		Implementor imp = new ConcreteImplementor1();
		//����һ�����󻯽�ɫ
		Abstraction abs = new RefinedAbstraction(imp);
		//ִ������
		abs.request();
	}
}
