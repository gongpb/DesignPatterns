package com.abstractFactory.abstractFactory;

/**
 * ��Ʒ�ȼ�1��ʵ����
 * @author gong_pibao
 */
public class Creator1 extends AbstractCreator{
	//ֻ������Ʒ�ȼ�Ϊ1 ��A��Ʒ
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}
	//ֻ������Ʒ�ȼ�Ϊ1 ��B��Ʒ
	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
	
}
