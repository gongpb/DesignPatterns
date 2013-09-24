package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * 导演类
 * @author gong_pibao
 */
public class Director {
	private AbsCarBuilder benz = new BenzBuilder();
	private AbsCarBuilder bmw = new BmwBuilder();
	//生产奔驰--A
	public ICar createBenzA(){
		return this.createCar(benz, "奔驰引擎", "奔驰车轮");
	}
	//生产宝马--A
	public ICar createBmwA(){
		return this.createCar(bmw, "宝马引擎", "宝马车轮");
	}
	
	//生产汽车
	public ICar createCar(AbsCarBuilder absbuilder, String engine, String wheel){
		BluePrint bp = new BluePrint(engine, wheel);
		System.out.println("获得生产蓝图");
		absbuilder.receiveBluePrint(bp);
		return absbuilder.builder();
	}
}
