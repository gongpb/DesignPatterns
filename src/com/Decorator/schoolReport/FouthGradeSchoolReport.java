package com.Decorator.schoolReport;

public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		//�ɼ����ĸ�ʽ��������ӵ�
		System.out.println("���XXX�ҳ���");
		System.out.println("  ---------   ");
		System.out.println("  ����65  ��ѧ68  ���� 98  ��Ȼ 93   ");
		System.out.println("  ---------   ");
		System.out.println("              �ҳ�ǩ��");
	}

	@Override
	public void sign(String name) {
		
		System.out.println("�ҳ�ǩ��Ϊ��" + name);
		
	}

}
