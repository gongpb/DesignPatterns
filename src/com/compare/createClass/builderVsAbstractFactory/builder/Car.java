package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * ��Ʒ��
 * @author gong_pibao
 */
public class Car implements ICar{
	private String engine;
	private String wheel;
	
	public Car(String engine, String wheel){
		this.engine = engine;
		this.wheel = wheel;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	@Override
	public String getEngine() {
		return this.engine;
	}
	@Override
	public String getWheel() {
		return this.wheel;
	}
	
	@Override
	public String toString() {
		return "���֣�"+this.wheel+"\t�����棺"+this.engine;
	}

}
