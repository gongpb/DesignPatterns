package com.abserver.updateHanFeiZi2;

public class Obama  implements Observer{
	@Override
	public void update(String context) {
		System.out.println("Obama：发现习主席活动，开始向老板汇报了......");
		this.reportToQinShiHuang(context);
		System.out.println("Obama：汇报完毕...\n");
	}
	//汇报给秦始皇
	public  void reportToQinShiHuang(String reportContext){
		
		System.out.println("Obama：报告，请老板！习主席有活动了......"+reportContext);
		
	}
}
