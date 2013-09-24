package com.memento.mementoExtend;
/**
 * �����˽�ɫ
 * @author gong_pibao
 */
public class Originator implements Cloneable {
	//�����������ָ��ͱ���
	private Originator backup;
	//�ڲ�״̬
	private String state = "";

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//����һ������¼
	public void createMemento(){
		this.backup = this.clone();
	}
	//�ָ�һ������¼
	public void restoreMemento(){
		this.setState(this.backup.getState());
	}
	//��¡��ǰ����
	@Override
	protected Originator clone() {
		Originator originator = null;
		try {
			originator = (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return originator;
	}
	
}
