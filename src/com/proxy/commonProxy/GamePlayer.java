package com.proxy.commonProxy;

public class GamePlayer implements IGamePlayer{
	private String name = "";
	//ͨ�����췽����������
	public GamePlayer(IGamePlayer gamePlayer , String name) throws Exception{
		if(gamePlayer==null){
			throw new Exception("���ܴ�����ʵ��ɫ");
		} else {
			this.name = name;
		}
	}
	//���
	@Override
	public void killBoss() {
		System.out.println(this.name+"�ڴ��");
	}
	//��¼
	@Override
	public void login(String user, String password) {
		System.out.println("��¼��Ϊ    "+user+" ���û�     "+this.name+"  ��¼�ɹ�");
	}
	//����
	@Override
	public void upgrade() {
		System.out.println(this.name+"  ������һ�� ! ");
	}

}
