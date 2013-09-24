package com.abserver.updateHanFeiZi3;

import java.util.Observable;
import java.util.Observer;
/**
 * 用java中自带接口java.util.Observer
 * @author gong_pibao
 */
public class WangSi  implements Observer{
	//一看到韩非子有活动，他就痛哭
	public  void cry(String reportContext){
		System.out.println("王斯：因为 "+reportContext+"--所以我悲伤呀！");
		
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("王斯：发现韩非子活动，开始向老板汇报了......");
		this.cry(arg.toString());
		System.out.println("王斯：汇报完毕...\n");
	}
}
