package com.abserver.updateHanFeiZi3;

import java.util.Observable;
import java.util.Observer;
/**
 * ��java���Դ��ӿ�java.util.Observer
 * @author gong_pibao
 */
public class Obama  implements Observer{
	//�㱨����ʼ��
	public  void reportToQinShiHuang(String reportContext){
		System.out.println("Obama������������ϰ��ƽ�л��......"+reportContext);
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Obama������ϰ��ƽ�����ʼ���ϰ�㱨��......");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("Obama���㱨���...\n");
	}
}
