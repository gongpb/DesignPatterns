package com.compare.createClass.builderVsAbstractFactory.abstractFactory;

public class CreatorB extends AbsFactory{
	//生产奔驰--B
	@Override
	public AbsBens createBens() {
		return new BenzCarB();
	}
	//生产宝马--B
	@Override
	public AbsBmw createBmw() {
		return new BmwCarB();
	}

}
