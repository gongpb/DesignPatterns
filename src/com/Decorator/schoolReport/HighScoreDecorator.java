package com.Decorator.schoolReport;

/**
 * ��߳ɼ������� 
 * @author gong_pibao
 */
public class HighScoreDecorator extends Decorator{
	//���췽��
	public HighScoreDecorator(SchoolReport sr){
		super(sr);
	}
	//�㱨��߳ɼ�
	private void reportHightScore(){
		System.out.println("��ο�����߳ɼ�   ������80 �� ��ѧ�� 90");	
	}
	//���ɼ���֮ǰ����������߳ɼ�
	@Override
	public void report() {
		this.reportHightScore(); //��߳ɼ�
		super.report();
	}
}
