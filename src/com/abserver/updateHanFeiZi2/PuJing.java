package com.abserver.updateHanFeiZi2;

public class PuJing  implements Observer{
	@Override
	public void update(String context) {
		System.out.println("普京：发现习主席活动，开始向老板汇报了......");
		this.cry(context);
		System.out.println("普京：汇报完毕...\n");
	}
	//一看到韩非子有活动，他就痛哭
	public  void cry(String reportContext){
		System.out.println("普京：因为 "+reportContext+"--所以我悲伤呀！");
	}
}
