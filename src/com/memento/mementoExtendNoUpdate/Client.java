package com.memento.mementoExtendNoUpdate;
/**
 * 备忘录模式
 * 不能修改备份之后的数据
 * 安全是绝对的，没有绝对的安全，可以适用refelect反射修改备份(Memento)的数据。
 * 在这里我们提供了一个新的设计方法：双接口设计，我们的一个类可以实现多个接口，
 * 在系统设计时，如果考虑对象的安全问题，则可以提供两个接口，一个是业务的正常
 * 接口，实现必要的业务逻辑，叫做款接口；另一个接口是一个空接口，什么方法都没有
 * 其目的是提供个子系统外的模块访问，比如容器对象，这个叫窄接口，由于窄接口
 * 没有提供任何操纵数据的方法，因此相对来说是比较安全的。
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义发起人
		Originator originator = new Originator();
		//定义备忘录管理员
		Caretaker caretaker = new Caretaker();
		//初始化壮年太
		originator.setState("初始化状态");
		System.out.println("初始化："+originator.getState());
		//创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		//改变状态
		originator.setState("改变状态");
		System.out.println("修改后："+originator.getState());
		//恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("恢复后："+originator.getState());
	}
}
