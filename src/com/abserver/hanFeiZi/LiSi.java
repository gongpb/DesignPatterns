package com.abserver.hanFeiZi;

public class LiSi  implements ILiSi{
	@Override
	public void update(String context) {
		System.out.println("李斯：发现韩非子活动，开始想老板汇报了......");
		this.reportToQinShiHuang(context);
		System.out.println("李斯：汇报完毕...\n");
	}
	//汇报给秦始皇
	public  void reportToQinShiHuang(String reportContext){
		
		System.out.println("李斯：报告，请老板！韩非子有活动了......"+reportContext);
		
	}
}
