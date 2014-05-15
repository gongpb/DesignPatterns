package com.chain.chain;

/**
 * ����Ĵ�����
 * 1������һ������Ĵ�����handlerMessage��Ψһ���⿪���� ����
 * 2������һ�����ı��ŷ���setNext��������һ��������
 * 3�������˾���������߱���ʵ�ֵ����������������Լ��ܹ�����ļ���getHandler
 * �;���Ĵ�������echo
 * @author gong_pibao
 *
 */
public abstract class Handler {
	public final static int LEVER_REQUEST_1 = 1;
	public final static int LEVER_REQUEST_2 = 2;
	public final static int LEVER_REQUEST_3 = 3;
	
	private Handler nextHandler;
	//ÿ�������Ŷ������������������
	public final Response handlerMessage(Request request){
		Response response = null;
		//�ж��Ƿ����Լ��Ĵ�����
		if(this.getHandlerLevlel().equals(request.getRequestLevel()))
		{
			response = this.echo(request);
		}
		else  //�������Լ��ļ���
		{
			if(this.nextHandler != null)
			{
				response = this.nextHandler.handlerMessage(request);
			} 
			else {
				//û���ʵ��Ĵ����ߣ�ҵ�����д���
			}
		}
		return response;
	}
	//������һ����������˭
	public void setNext (Handler handler){
		this.nextHandler = handler;
	}
	//ÿ�������߶���һ��������
	protected abstract Level getHandlerLevlel();
	//ÿ�������߶�����ʵ�ִ�������
	protected abstract Response echo(Request request);
}
