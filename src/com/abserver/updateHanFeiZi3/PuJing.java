package com.abserver.updateHanFeiZi3;

import java.util.Observable;
import java.util.Observer;
/**
 * ��java���Դ��ӿ�java.util.Observer
 * @author gong_pibao
 */
public class PuJing  implements Observer{
	//һ�����������л������ʹ��
	public  void cry(String reportContext){
		System.out.println("�վ�����Ϊ "+reportContext+"--�����ұ���ѽ��");
		
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("�վ������ֺ����ӻ����ʼ���ϰ�㱨��......");
		this.cry(arg.toString());
		System.out.println("�վ����㱨���...\n");
	}
}
