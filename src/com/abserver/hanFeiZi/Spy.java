package com.abserver.hanFeiZi;

public class Spy extends Thread{
	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	//ͨ�����췽�����ݲ�������Ҫ��ص���˭��˭����أ�Ҫ���ʲô
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
			// ����Ƿ�Ҫ�Է�
			if(this.type.equals("breakfast")){
				if(this.hanFeiZi.isHaveBreakfast()){
					this.liSi.update("�������ڳԷ�");
					this.hanFeiZi.setHaveBreakfast(false); //����״̬���������
				}
			}else //����Ƿ�������
			{
				if(this.hanFeiZi.isFun())
				{
					this.liSi.update("������������");
					this.hanFeiZi.setFun(false); //����״̬���������
				}
			}
		}
	}
}
