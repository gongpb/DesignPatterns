package com.compare.createClass.builderVsAbstractFactory.abstractFactory;

public class CreatorA extends AbsFactory{
	//��������--A
	@Override
	public AbsBens createBens() {
		return new BenzCarA();
	}
	//��������--A
	@Override
	public AbsBmw createBmw() {
		return new BmwCarA();
	}

}
