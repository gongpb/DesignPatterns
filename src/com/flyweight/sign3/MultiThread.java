package com.flyweight.sign3;

/**
 * ���̳߳���
 * 
 * @author gong_pibao
 */
public class MultiThread extends Thread {
	private SignInfo signInfo;
	public MultiThread(SignInfo signInfo){
		this.signInfo = signInfo;
	}
	@Override
	public void run() {
		if(!signInfo.getId().equals(signInfo.getLocation()))
		{
			System.out.println("��ţ�" + signInfo.getId()+"\t���Ե�ַ��" + signInfo.getLocation());
			System.out.println("�̲߳���ȫ��......");
		} 
		else
		{
			System.out.println("-------------��ţ�" + signInfo.getId()+"\t���Ե�ַ��" + signInfo.getLocation());
		}
	}
}
