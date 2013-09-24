package com.compare.createClass.builderVsAbstractFactory.abstractFactory;

public class CreatorA extends AbsFactory{
	//生产奔驰--A
	@Override
	public AbsBens createBens() {
		return new BenzCarA();
	}
	//生产宝马--A
	@Override
	public AbsBmw createBmw() {
		return new BmwCarA();
	}

}
