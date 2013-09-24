package com.mediator.mediator;
/**
 * @author gong_pibao
 * ����ͬ����
 * ÿһ��ͬ�½�ɫ��֪���н��߽�ɫ��������������ͬ�½�ɫͨ�ŵ�ʱ��һ��Ҫͨ���н��߽�ɫЭ����
 * ÿ��ͬ�µ���Ϊ��Ϊ���֣�һ����ͬ�±������Ϊ������ı�������״̬�������Լ�����Ϊ�ȣ�
 * ���ַ��������Է���Ϊ(self-Method)����������ͬ��������н���û���κε�������
 * �ڶ����Ǳ��������н��߲�����ɵ���Ϊ��������������(Dep-Method)
 */
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
