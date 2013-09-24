package com.strategy.enunStrategy;

/**
 * 枚举策略是一个非常优秀、方便的模式，但是它受枚举类型的限制
 * 每个枚举项都是public、final、static 的扩展性受到了一定的制约
 * @author gong_pibao
 */
public enum Calculator {
    /**通过括号赋值,而且必须有带参构造器和一属性跟方法，否则编译出错
     * 赋值必须是都赋值或都不赋值，不能一部分赋值一部分不赋值
     * 如果不赋值则不能写构造器，赋值编译也出错
     * 可以定义一个抽象方法，但是必须在属性的方法中实现这个抽象方法,否则编译出错
     **/
	//加法运算
	ADD("+"){
		@Override
		public int exec(int a, int b) {
			 return a+b;
		}},
	//减法运算
	SUB("-"){
		@Override
		public int exec(int a, int b) {
			return a-b;
		}
	};
	
	String value = "";
	//定义成员值类型
	private Calculator(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	//声明一个抽象函数
	public abstract int exec(int a, int b);
}
