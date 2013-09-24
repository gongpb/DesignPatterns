package com.compare.createClass.builderVsAbstractFactory.abstractFactory;
/**
 * 抽象工厂模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//生产奔驰
		AbsFactory absA = new CreatorA();
		AbsBens benzA = absA.createBens();
		System.out.println("型号："+benzA.getXing()+"\t品牌："+benzA.getBand());
		
		AbsFactory absB = new CreatorB();
		AbsBmw bmwB = absB.createBmw();
		System.out.println("型号："+bmwB.getXing()+"\t品牌："+bmwB.getBand());
		
		AbsFactory absC = new CreatorC();
		AbsBens benzC = absA.createBens();
		System.out.println("型号："+bmwB.getXing()+"\t品牌："+bmwB.getBand());
	}
}
