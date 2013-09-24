package com.chain.women;

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
		this.request = request;
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
