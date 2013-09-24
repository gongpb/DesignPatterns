package com.memento.mementoExtendMoreBackUp;
/**
 * ����¼ģʽ
 * �౸��
 * ע�⣺�ڴ�������⣬�ı���һ�������ͷ����ڴ棬û���κ����ٵ��������Ƿǳ�Σ�յģ�
 * ��ˣ���ϵͳ���ʱ��Ҫ�ϸ����Ʊ���¼�Ĵ�������������Map�����ޣ�����ϵͳ������
 * �����ڴ���������
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//���巢����
		Originator originator = new Originator();
		//���屸��¼����Ա
		Caretaker caretaker = new Caretaker();
		//������������¼
		caretaker.setMemento("0001",originator.createMemento());
		caretaker.setMemento("0002",originator.createMemento());
		//�ָ�һ��ָ���ı���¼
		originator.restoreMemento(caretaker.getMemento("0001"));
	}
}
