package com.chain.chain;

/**
 * 抽象的处理者
 * 1、定义一个请求的处理方法handlerMessage，唯一对外开发的 方法
 * 2、定义一个链的编排方法setNext，设置下一个处理者
 * 3、定义了具体的请求者必须实现的两个方法：定义自己能够处理的级别getHandler
 * 和具体的处理任务echo
 * @author gong_pibao
 *
 */
public abstract class Handler {
	public final static int LEVER_REQUEST_1 = 1;
	public final static int LEVER_REQUEST_2 = 2;
	public final static int LEVER_REQUEST_3 = 3;
	
	private Handler nextHandler;
	//每个矗立着都必须对请求做出处理
	public final Response handlerMessage(Request request){
		Response response = null;
		//判断是否有自己的处理级别
		if(this.getHandlerLevlel().equals(request.getRequestLevel()))
		{
			response = this.echo(request);
		}
		else  //不属于自己的级别
		{
			if(this.nextHandler != null)
			{
				response = this.nextHandler.handlerMessage(request);
			} 
			else {
				//没有适当的处理者，业务自行处理
			}
		}
		return response;
	}
	//设置下一个请求者是谁
	public void setNext (Handler handler){
		this.nextHandler = handler;
	}
	//每个处理者都有一个处理级别
	protected abstract Level getHandlerLevlel();
	//每个处理者都必须实现处理任务
	protected abstract Response echo(Request request);
}
