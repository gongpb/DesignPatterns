package com.compare.createClass.builderVsAbstractFactory.builder;
/**
 * ��������
 * @author gong_pibao
 */
public abstract class AbsCarBuilder {
	private BluePrint bp; //�����ͼ
	public Car builder(){
		return new Car(this.buildEngine(), this.buildWheel());
	}
	//����һ����ͼ
	public void receiveBluePrint(BluePrint bp){
		this.bp = bp;
	}
	//�鿴��ͼ
	public BluePrint getBluePrint(){
		return bp;
	}
	//����
	public abstract String buildEngine();
	//����
	public abstract String buildWheel();
}
