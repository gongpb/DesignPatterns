package com.builder.builder;

/**
 * ���幹���ţ���������Ʒ�࣬�ͻ��м�������Ľ����ߣ�
 * ��������Ʒ�������ͬ�Ľӿڻ������
 * @author gong_pibao
 */
public class ConcreteProduct extends Builder{
	Product product = new Product();
	/**
	 * �齨һ����Ʒ
	 */
	@Override
	public Product buildProduct() {
		
		return product;
	}
	/**
	 * ���ò�Ʒ�㲿��
	 */
	@Override
	public void setPart() {
		//��Ʒ���ڵ�ҵ����
		
	}

}
