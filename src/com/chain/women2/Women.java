package com.chain.women2;

public class Women implements IWomen{
	/**
	 * ��Ů�ĸ��� ���
	 * 1--δ����
	 * 2--����
	 * 3--����
	 */
	private int type = 0;
	//��Ů����ʾ
	private String request = "";
	//ͨ�����췽������������
	public Women(int type, String request){
		this.type = type;
//		this.request = request;
		//Ϊ�˱�����ʾ����������㴦��
		switch (this.type)
		{
		case 1:
				this.request = "Ů���������ǣ�"+request;
				break;
		case 2:
			this.request = "���ӵ������ǣ�"+request;
			break;
		case 3:
			this.request = "ĸ�׵������ǣ�"+request;
			break;
		}
	}
	//��ø�Ů������
	@Override
	public String getRequest() {
		return this.request;
	}
	
	//��ø�Ů������
	@Override
	public int getType() {
		return this.type;
	}

}
