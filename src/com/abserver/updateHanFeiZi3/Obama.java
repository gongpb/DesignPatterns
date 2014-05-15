package com.abserver.updateHanFeiZi3;

import java.util.Observable;
import java.util.Observer;
/**
 * 用java中自带接口java.util.Observer
 * @author gong_pibao
 */
public class Obama  implements Observer{
	//汇报给秦始皇
	public  void reportToQinShiHuang(String reportContext){
		System.out.println("Obama：报告美国！习近平有活动了......"+reportContext);
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Obama：发现习近平活动，开始向老板汇报了......");
		this.reportToQinShiHuang(arg.toString());
		System.out.println("Obama：汇报完毕...\n");
	}
}
