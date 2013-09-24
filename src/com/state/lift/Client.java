package com.state.lift;

/**
 * 场景类
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		ILift lift = new Lift();
		//电梯出事条件是停止状态
		lift.setState(ILift.STATE_STOPPING);
		//电梯首先应该是开门，让人进去
		lift.open();
		//然后电梯门关闭
		lift.close();
		//电梯运行
		lift.run();
		//到达目的地，停止
		lift.stop();
	}
}
