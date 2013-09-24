package com.abserver.updateHanFeiZi2;

public class WangSi  implements Observer{
	@Override
	public void update(String context) {
		System.out.println("王斯：发现韩非子活动，开始向老板汇报了......");
		this.cry(context);
		System.out.println("王斯：汇报完毕...\n");
	}
	//一看到韩非子有活动，他就痛哭
	public  void cry(String reportContext){
		System.out.println("王斯：因为 "+reportContext+"--所以我悲伤呀！");
		
	}
}
