package com.state.state;
/**
 * 状态模式
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//定义环境变量
		Context context = new Context();
		//初始化状态
		context.setCurrentState(Context.STATE1);
		context.handle1();
		context.handle2();
	}
}
