package com.builder.builder;
/**
 * ������
 * ��������ģ���˳��Ȼ�����Builder��ʼ����
 * ͨ������һ����ϻ�̳�(��ģ�巽��ģʽ)��������
 * @author gong_pibao
 *
 */
public class Director {
	private Builder builder = new ConcreteProduct();
	
	//������ͬ�Ĳ�Ʒ
	public  Product getAProduct(){
		this.builder.setPart();
		//���ò�ͬ�������������ͬ�Ĳ�Ʒ
		
		return this.builder.buildProduct();
	}
}
