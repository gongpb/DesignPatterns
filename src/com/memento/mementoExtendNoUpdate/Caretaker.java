package com.memento.mementoExtendNoUpdate;
/**
 * 管理员角色
 * @author gong_pibao
 */
public class Caretaker {
	//备忘录对象
	private IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
}
