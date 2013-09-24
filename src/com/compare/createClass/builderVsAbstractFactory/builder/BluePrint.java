package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * Éú²úÀ¶Í¼
 * @author gong_pibao
 */
public class BluePrint{
	private String engine;
	private String wheel;
	
	public BluePrint(String engine, String wheel){
		this.engine = engine;
		this.wheel = wheel;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	public String getEngine() {
		return this.engine;
	}

	public String getWheel() {
		return this.wheel;
	}

}
