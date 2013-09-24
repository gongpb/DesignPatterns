package com.memento.mementoExtendMoreState;
/**
 * 备忘录模式
 * 场景类
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义发起人
		Originator originator = new Originator();
		//定义备忘录管理员
		Caretaker caretaker = new Caretaker();
		//初始化
		originator.setState1("中国");
		originator.setState2("强盛");
		originator.setState3("繁荣");
		System.out.println("----初始化状态----\n"+originator);
		//创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		//改变改变状态值
		originator.setState1("软件");
		originator.setState2("架构");
		originator.setState3("优秀");
		System.out.println("\n----修改之后的值----\n"+originator);
		//恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("\n----恢复之后的值----\n"+originator);
	}
}
