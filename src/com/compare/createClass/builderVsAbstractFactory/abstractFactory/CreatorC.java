package com.compare.createClass.builderVsAbstractFactory.abstractFactory;

public class CreatorC extends AbsFactory{
	//生产奔驰--C
	@Override
	public AbsBens createBens() {
		return new BenzCarC();
	}

	//生产宝马--B
	@Override
	public AbsBmw createBmw() {
		return new BmwCarB();
	}

}
