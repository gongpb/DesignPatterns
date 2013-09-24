package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * ������
 * @author gong_pibao
 */
public class Director {
	private AbsCarBuilder benz = new BenzBuilder();
	private AbsCarBuilder bmw = new BmwBuilder();
	//��������--A
	public ICar createBenzA(){
		return this.createCar(benz, "��������", "���۳���");
	}
	//��������--A
	public ICar createBmwA(){
		return this.createCar(bmw, "��������", "������");
	}
	
	//��������
	public ICar createCar(AbsCarBuilder absbuilder, String engine, String wheel){
		BluePrint bp = new BluePrint(engine, wheel);
		System.out.println("���������ͼ");
		absbuilder.receiveBluePrint(bp);
		return absbuilder.builder();
	}
}
