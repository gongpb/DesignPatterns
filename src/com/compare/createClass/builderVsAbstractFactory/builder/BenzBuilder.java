package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * ���彨����
 * @author gong_pibao
 */
public class BenzBuilder extends AbsCarBuilder{

	@Override
	public String buildEngine() {
		return super.getBluePrint().getEngine();
	}

	@Override
	public String buildWheel() {
		return super.getBluePrint().getWheel();
	}

}
