package com.chain.women;

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
		this.request = request;
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
