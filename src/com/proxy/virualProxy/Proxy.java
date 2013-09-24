package com.proxy.virualProxy;

/**
 * �������
 * ����Ҫ��ʱ��ų�ʼ��������󣬿��Ա��ⱻ�������У������ĳ�ʼ������������
 * ȱ���ǣ���Ҫ��ÿ���������ж���������Ƿ񱻴���
 * @author gong_pibao
 */
public class Proxy implements Subject{
	//Ҫ�����Ǹ�ʵ����
	private Subject subject;
	//Ĭ�ϱ�������
	public Proxy(Subject subject){
		this.subject = subject;
	}
	//ʵ�ֽӿ��ж���ķ���
	@Override
	public void request() {
		//�ж�һ����ʵ�����Ƿ��ʼ��
		if(subject ==null){
			this.subject = new RealSubject();
		}
		this.subject.request();
	}
}
