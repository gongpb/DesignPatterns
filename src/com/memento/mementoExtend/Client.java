package com.memento.mementoExtend;
/**
 * ����¼ģʽ
 * ������
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//���巢����
		Originator originator = new Originator();
		originator.setState("��ʼ״̬");
		System.out.println("��ʼ״̬�ǣ�"+originator.getState());
		//��������
		originator.createMemento();
		//�޸�״̬
		originator.setState("�޸�״̬���״̬");
		System.out.println("�޸�״̬�ǣ�"+originator.getState());
		//���屸��¼����Ա
		originator.restoreMemento();
		System.out.println("�ָ����״̬��"+originator.getState());
		
	}
}
