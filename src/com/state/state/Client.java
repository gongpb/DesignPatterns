package com.state.state;
/**
 * ״̬ģʽ
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//���廷������
		Context context = new Context();
		//��ʼ��״̬
		context.setCurrentState(Context.STATE1);
		context.handle1();
		context.handle2();
	}
}
