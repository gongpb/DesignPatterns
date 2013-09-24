package com.proxy.forceProxy;

/**
 * ǿ�ƴ������ʵ��ɫ
 * @author gong_pibao
 */
public class GamePlayer implements IGamePlayer{
	private String name = "";
	private IGamePlayer proxy = null;
	
	//ͨ�����췽����������
	public GamePlayer(String name){
		this.name = name;
	}
	
	//�ҵ��Լ��Ĵ���
	@Override
	public IGamePlayer getProxy(){
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	//���
	@Override
	public void killBoss() {
		if(this.isProxy()){
			System.out.println(this.name+"  �ڴ�֣�");
		} else {
			System.out.println("��ʹ��ָ���Ĵ�����ʣ�");
		}
	}
	
	//��¼
	@Override
	public void login(String user, String password) {
		if(this.isProxy()){
			System.out.println("��¼��Ϊ    "+user+" ���û�     "+this.name+"  ��¼�ɹ�");
		} else {
			System.out.println("��ʹ��ָ���Ĵ������ ��");
		}
	}
	
	//����
	@Override
	public void upgrade() {
		if(this.isProxy()){
			System.out.println(this.name+"  ������һ�� ! ");
		} else {
			System.out.println("��ʹ��ָ���Ĵ�����ʣ�");
		}
	}
	//��֤�Ƿ��Ǵ������
	public boolean isProxy(){
		if(this.proxy==null){
			return false;
		} else {
			return true;
		}
	}
}
