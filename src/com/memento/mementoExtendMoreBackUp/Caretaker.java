package com.memento.mementoExtendMoreBackUp;

import java.util.HashMap;

/**
 * 管理员角色
 * @author gong_pibao
 */
public class Caretaker {
	//容纳备忘录的容器
	private HashMap<String, Memento> memMap = new HashMap<String, Memento>();
	//备忘录对象
//	private Memento memento;

	public Memento getMemento(String idx) {
		return this.memMap.get(idx);
	}

	public void setMemento(String idx, Memento memento) {
		this.memMap.put(idx, memento);
	}
}
