package com.Decorator.compnent;

public abstract class Decorator extends Component{
	private Component comp;
	//通过构造方法传递被装饰着
	public Decorator(Component comp){
		this.comp = comp;
	}
	//委托给被装饰着执行
	@Override
	public void operate() {
		this.comp.operate();
	}
}
