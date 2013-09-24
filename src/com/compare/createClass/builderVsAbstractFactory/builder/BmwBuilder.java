package com.compare.createClass.builderVsAbstractFactory.builder;

public class BmwBuilder extends AbsCarBuilder{

	@Override
	public String buildEngine() {
		// TODO Auto-generated method stub
		return super.getBluePrint().getEngine();
	}

	@Override
	public String buildWheel() {
		// TODO Auto-generated method stub
		return super.getBluePrint().getWheel();
	}

}
