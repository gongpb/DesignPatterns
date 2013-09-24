package com.state.lift;

/**
 * ������
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		ILift lift = new Lift();
		//���ݳ���������ֹͣ״̬
		lift.setState(ILift.STATE_STOPPING);
		//��������Ӧ���ǿ��ţ����˽�ȥ
		lift.open();
		//Ȼ������Źر�
		lift.close();
		//��������
		lift.run();
		//����Ŀ�ĵأ�ֹͣ
		lift.stop();
	}
}
