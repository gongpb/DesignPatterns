package com.bridge.bridge;

/**
 * ������󻯽�ɫ 
 * @author gong_pibao
 */
public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor imp) {
		super(imp);
	}
	//�����������Ϊ
	@Override
	public void request() {
		super.request();
		super.getImp().doAnything();
	}

}
