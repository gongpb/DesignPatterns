package com.memento.mementoExtendMoreBackUp;
/**
 * 备忘录模式
 * 多备份
 * 注意：内存溢出问题，改北方一旦产生就放入内存，没有任何销毁的意向，这是非常危险的，
 * 因此，在系统设计时候，要严格限制备忘录的创建，建议增加Map的上限，否则系统很容易
 * 产生内存溢出的情况
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义发起人
		Originator originator = new Originator();
		//定义备忘录管理员
		Caretaker caretaker = new Caretaker();
		//创建两个备忘录
		caretaker.setMemento("0001",originator.createMemento());
		caretaker.setMemento("0002",originator.createMemento());
		//恢复一个指定的备忘录
		originator.restoreMemento(caretaker.getMemento("0001"));
	}
}
