package com.Decorator.compnent;

/**
 * 具体构件 是最核心、最原始、最基本的接口或者抽象类的实现，我们要装饰的就是这个类
 * @author gong_pibao
 */
public class ConcreteComponent extends Component {

	@Override
	public void operate() {
		System.out.println("do something");
	}

}
