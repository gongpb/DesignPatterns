package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * 抽象建筑者
 * @author gong_pibao
 */
public abstract class AbsCarBuilder {
	private BluePrint bp; //设计蓝图
	public Car builder(){
		return new Car(this.buildEngine(), this.buildWheel());
	}
	//接受一份蓝图
	public void receiveBluePrint(BluePrint bp){
		this.bp = bp;
	}
	//查看蓝图
	public BluePrint getBluePrint(){
		return bp;
	}
	//引擎
	public abstract String buildEngine();
	//车轮
	public abstract String buildWheel();
}
