package com.Decorator.schoolReport;

/**
 * ���εĳ�����
 * ����������þ��Ƿ�װ SchoolReport ��
 * @author gong_pibao
 */
public abstract class Decorator extends SchoolReport{
	//����֪���ĸ��ɼ���
	private SchoolReport sr ;
	//���췽�������ݳɼ�������
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	//�鿴�ɼ���
	@Override
	public void report() {
		this.sr.report();
	}
    //����ɼ���Ҫǩ��
	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
