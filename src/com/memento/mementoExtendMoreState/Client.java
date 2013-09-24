package com.memento.mementoExtendMoreState;
/**
 * ����¼ģʽ
 * ������
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//���巢����
		Originator originator = new Originator();
		//���屸��¼����Ա
		Caretaker caretaker = new Caretaker();
		//��ʼ��
		originator.setState1("�й�");
		originator.setState2("ǿʢ");
		originator.setState3("����");
		System.out.println("----��ʼ��״̬----\n"+originator);
		//����һ������¼
		caretaker.setMemento(originator.createMemento());
		//�ı�ı�״ֵ̬
		originator.setState1("���");
		originator.setState2("�ܹ�");
		originator.setState3("����");
		System.out.println("\n----�޸�֮���ֵ----\n"+originator);
		//�ָ�һ������¼
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("\n----�ָ�֮���ֵ----\n"+originator);
	}
}
