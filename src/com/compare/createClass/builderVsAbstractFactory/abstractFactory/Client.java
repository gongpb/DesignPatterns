package com.compare.createClass.builderVsAbstractFactory.abstractFactory;
/**
 * ���󹤳�ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//��������
		AbsFactory absA = new CreatorA();
		AbsBens benzA = absA.createBens();
		System.out.println("�ͺţ�"+benzA.getXing()+"\tƷ�ƣ�"+benzA.getBand());
		
		AbsFactory absB = new CreatorB();
		AbsBmw bmwB = absB.createBmw();
		System.out.println("�ͺţ�"+bmwB.getXing()+"\tƷ�ƣ�"+bmwB.getBand());
		
		AbsFactory absC = new CreatorC();
		AbsBens benzC = absA.createBens();
		System.out.println("�ͺţ�"+bmwB.getXing()+"\tƷ�ƣ�"+bmwB.getBand());
	}
}
