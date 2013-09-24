package com.bridge.bridge;

/**
 * 具体抽象化角色 
 * @author gong_pibao
 */
public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}
	//修正父类的行为
	@Override
	public void request() {
		super.request();
		super.getImp().doAnything();
	}

}
