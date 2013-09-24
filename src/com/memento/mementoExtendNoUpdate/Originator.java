package com.memento.mementoExtendNoUpdate;
/**
 * �����˽�ɫ
 * @author gong_pibao
 */
public class Originator {
	//�ڲ�״̬
	private String state = "";

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//����һ������¼
	public Memento createMemento(){
		return new Memento(this.state);
	}
	//�ָ�һ������¼
	public void restoreMemento(IMemento memento){
		this.setState(((Memento) memento).getState());
	}
	/**
	 * �ڲ���
	 * �ڲ���ȫ����private����Ȩ�ޣ�Ҳ����˵���������ˣ�����������ʵ��������Ҫ����������ϵҪ��δ����أ�
	 * ͨ���ӿڣ���Ŷ�ǻ���һ���սӿ��ǹ�������Ȩ��
	 */
	private class Memento implements IMemento{
		//�����˵��ڲ�״̬
		private String state = "";
		//ͨ�����췽������״̬
		public Memento(String state){
			this.state = state ;
		}
		private String getState() {
			return state;
		}
		private void setState(String state) {
			this.state = state;
		}
	}
	
}
