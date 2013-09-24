package com.memento.memento;
/**
 * 管理员角色
 * @author gong_pibao
 */
public class Caretaker {
	//备忘录对象
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
