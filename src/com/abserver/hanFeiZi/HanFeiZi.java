package com.abserver.hanFeiZi;

public class HanFeiZi implements IHanFeiZi{
	//韩非子是否在吃饭，作为监控的标准
	private boolean isHaveBreakfast = false;
	//韩非子是否在娱乐
	private boolean isFun = false;
	//韩非子要吃饭了
	@Override
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了----");
		this.isHaveBreakfast = true;
	}
	//韩非子开始娱乐了
	@Override
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了----");
		this.isFun = true;
	}
	
	public boolean isHaveBreakfast() {
		return isHaveBreakfast;
	}
	public void setHaveBreakfast(boolean isHaveBreakfast) {
		this.isHaveBreakfast = isHaveBreakfast;
	}
	public boolean isFun() {
		return isFun;
	}
	public void setFun(boolean isFun) {
		this.isFun = isFun;
	}

}
