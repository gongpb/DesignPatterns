package com.abserver.updateHanFeiZi3;

import java.util.Observable;
import java.util.Observer;
/**
 * ��java���Դ��ӿ�java.util.Observer
 * @author gong_pibao
 */
public class LiSi  implements Observer{
	//�㱨����ʼ��
	public  void reportToQinShiHuang(String reportContext){
		System.out.println("��˹���������ϰ壡�������л��......"+reportContext);
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("��˹�����ֺ����ӻ����ʼ���ϰ�㱨��......");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("��˹���㱨���...\n");
	}
}
