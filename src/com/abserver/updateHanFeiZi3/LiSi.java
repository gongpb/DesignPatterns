package com.abserver.updateHanFeiZi3;

import java.util.Observable;
import java.util.Observer;
/**
 * 用java中自带接口java.util.Observer
 * @author gong_pibao
 */
public class LiSi  implements Observer{
	//汇报给秦始皇
	public  void reportToQinShiHuang(String reportContext){
		System.out.println("李斯：报告秦老板！韩非子有活动了......"+reportContext);
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("李斯：发现韩非子活动，开始向老板汇报了......");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("李斯：汇报完毕...\n");
	}
}
