package com.abserver.hanFeiZi;

public class Spy extends Thread{
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	//通过构造方法传递参数，我要监控的是谁，谁来监控，要监控什么
	public Spy( HanFeiZi hanFeiZi, LiSi liSi, String type ){
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}
	@Override
	public void run() 
	{
//		super.run();
		while(true){
			// 监控是否要吃饭
			if(this.type.equals("breakfast")){
				if(this.hanFeiZi.isHaveBreakfast()){
					this.liSi.update("韩非子在吃饭");
					this.hanFeiZi.setHaveBreakfast(false); //重置状态，继续监控
				}
			}else //监控是否在娱乐
			{
				if(this.hanFeiZi.isFun())
				{
					this.liSi.update("韩非子在娱乐");
					this.hanFeiZi.setFun(false); //重置状态，继续监控
				}
			}
		}
	}
}
