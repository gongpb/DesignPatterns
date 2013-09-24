package com.chain.women2;

public abstract class Handler {
	public final static int FATHER_LEVER_REQUEST = 1;
	public final static int HUSBAND_LEVER_REQUEST = 1;
	public final static int SON_LEVER_REQUEST = 1;
	//�ܴ���ļ���
	private int level = 0;
	//���δ��ݣ���һ����������˭
	private Handler nextHandler;
	//ÿ���඼Ҫ˵��һ���Լ��ܴ�����Щ����
	public Handler(int level){
		this.level = level;
	}
	//һ��Ů��(Ů�������ӻ���ĸ��)Ҫ���֣���Ҫ�����������
	public final void HandleMessagre(IWomen women){
		if(women.getType() == this.level)
		{
			this.response(women);
		}
		else 
		{
			if(this.nextHandler != null) //�к������ڣ���������������
			{
				this.nextHandler.HandleMessagre(women);
			}
			else  //�Ѿ�û�к����������ˣ����ô�����
			{
				System.out.println("------û�ط���ʾ�ˣ�����ͬ�⴦��------");
			}
		}
	}
	/**
	 * ����������㴦���������Ӧ����������һ�����ڵ���
	 */
	public void setNext(Handler handler){
		this.nextHandler = handler;
	}
	//����ʾ�ǵ�ȻҪ��Ӧ
	protected abstract void response(IWomen women);
}
