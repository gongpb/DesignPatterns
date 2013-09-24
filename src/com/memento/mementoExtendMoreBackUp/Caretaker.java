package com.memento.mementoExtendMoreBackUp;

import java.util.HashMap;

/**
 * ����Ա��ɫ
 * @author gong_pibao
 */
public class Caretaker {
	//���ɱ���¼������
	private HashMap<String, Memento> memMap = new HashMap<String, Memento>();
	//����¼����
//	private Memento memento;

	public Memento getMemento(String idx) {
		return this.memMap.get(idx);
	}

	public void setMemento(String idx, Memento memento) {
		this.memMap.put(idx, memento);
	}
}
