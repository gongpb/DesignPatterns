package com.abstractFactory.abstractFactory;
/**
 * ��Ʒ�ȼ�1��ʵ����
 * @author gong_pibao
 */
public class Creator2 extends AbstractCreator{
	//ֻ������Ʒ�ȼ�Ϊ2��A��Ʒ
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}
	//ֻ������Ʒ����Ϊ2 ��B��Ʒ
	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
