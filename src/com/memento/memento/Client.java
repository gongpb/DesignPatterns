package com.memento.memento;
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
		//����һ������¼
		caretaker.setMemento(originator.createMemento());
		//�ָ�һ������¼
		originator.restoreMemento(caretaker.getMemento());
	}
}
