package com.compare.createClass.builderVsAbstractFactory.abstractFactory;
/**
 * 抽象工厂 
 * @author gong_pibao
 */
public abstract class AbsFactory {
	public abstract AbsBens createBens(); //生产奔驰
	public abstract AbsBmw createBmw(); //生产宝马
}
