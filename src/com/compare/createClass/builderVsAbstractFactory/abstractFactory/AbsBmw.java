package com.compare.createClass.builderVsAbstractFactory.abstractFactory;
/**
 * 抽象产品类
 * @author gong_pibao
 */
public abstract class AbsBmw implements ICar {
	@Override
	public String getBand() {
		return "宝马";
	}
}
