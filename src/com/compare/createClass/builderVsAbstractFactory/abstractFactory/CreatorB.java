package com.compare.createClass.builderVsAbstractFactory.abstractFactory;

public class CreatorB extends AbsFactory{
	//��������--B
	@Override
	public AbsBens createBens() {
		return new BenzCarB();
	}
	//��������--B
	@Override
	public AbsBmw createBmw() {
		return new BmwCarB();
	}

}
