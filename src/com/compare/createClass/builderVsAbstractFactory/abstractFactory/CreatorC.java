package com.compare.createClass.builderVsAbstractFactory.abstractFactory;

public class CreatorC extends AbsFactory{
	//��������--C
	@Override
	public AbsBens createBens() {
		return new BenzCarC();
	}

	//��������--B
	@Override
	public AbsBmw createBmw() {
		return new BmwCarB();
	}

}
