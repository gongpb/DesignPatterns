package com.chain.women2;

public abstract class Handler {
	public final static int FATHER_LEVER_REQUEST = 1;
	public final static int HUSBAND_LEVER_REQUEST = 1;
	public final static int SON_LEVER_REQUEST = 1;
	//能处理的级别
	private int level = 0;
	//责任传递，下一个责任人是谁
	private Handler nextHandler;
	//每个类都要说明一下自己能处理哪些请求
	public Handler(int level){
		this.level = level;
	}
	//一个女性(女儿、妻子或者母亲)要求逛街，你要处理这个请求
	public final void HandleMessagre(IWomen women){
		if(women.getType() == this.level)
		{
			this.response(women);
		}
		else 
		{
			if(this.nextHandler != null) //有后续环节，请把请求往后递送
			{
				this.nextHandler.HandleMessagre(women);
			}
			else  //已经没有后续处理人了，不用处理了
			{
				System.out.println("------没地方请示了，按不同意处理------");
			}
		}
	}
	/**
	 * 如果不属于你处理的请求，你应该让她找下一个环节的人
	 */
	public void setNext(Handler handler){
		this.nextHandler = handler;
	}
	//有请示那当然要回应
	protected abstract void response(IWomen women);
}
