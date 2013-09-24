package com.state.lift2;

/**
 * ≥°æ∞¿‡
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(Context.closingStete);
		context.open();
		context.close();
		context.run();
		context.stop();
	}
}
