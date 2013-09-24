package com.flyweight.flyweight;

/**
 * ������Ԫ��ɫ
 * ������Ԫ��ɫһ��Ϊ�����࣬��ʵ����Ŀ���ܣ�һ����һ��ʵ���࣬��������һ������ķ�����
 * �ڳ����ɫ�У�һ����Ҫ���ⲿ״̬���ڲ�״̬������������������������չ
 * @author gong_pibao
 */
public abstract class Flyweight {
	//�ڲ�״̬
	private String intrinsic ;
	//�ⲿ״̬
	protected final String Extrinsic;
	//Ҫ����Ԫ��ɫ��������ⲿ״̬
	public Flyweight(String Extrinsic){
		this.Extrinsic = Extrinsic ;
	}
	//����ҵ�����
	public abstract void operate();
	
	public String getIntrinsic() {
		return intrinsic;
	}
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}
}
