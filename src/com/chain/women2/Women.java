package com.chain.women2;

public class Women implements IWomen{
	/**
	 * 妇女的个人 情况
	 * 1--未出嫁
	 * 2--出嫁
	 * 3--夫死
	 */
	private int type = 0;
	//妇女的请示
	private String request = "";
	//通过构造方法传过来请求
	public Women(int type, String request){
		this.type = type;
//		this.request = request;
		//为了便于显示，在这里过点处理
		switch (this.type)
		{
		case 1:
				this.request = "女儿的请求是："+request;
				break;
		case 2:
			this.request = "妻子的请求是："+request;
			break;
		case 3:
			this.request = "母亲的请求是："+request;
			break;
		}
	}
	//获得妇女的请求
	@Override
	public String getRequest() {
		return this.request;
	}
	
	//获得妇女的请求
	@Override
	public int getType() {
		return this.type;
	}

}
