package com.adapter.adapter;
/**
 * ������ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//ԭ�е�ҵ���߼�
		Target target = new ConcreteTarget();
		target.request();
		System.out.println("\n");
		//��������������ɫ֮���ҵ���߼�
		Target targetAdapter = new Adapter();
		targetAdapter.request();
	}
}
