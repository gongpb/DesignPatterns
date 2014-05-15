package com.Decorator.schoolReport;

/**
 * �鿴���κ�ĳɼ���
 * @author gong_pibao
 */
public class Father {
	public static void main(String [] args ){
		SchoolReport sr ;
		//ԭװ�ĳɼ���
		sr = new FouthGradeSchoolReport();
		//������߷�˵���ĳɼ���
		sr = new HighScoreDecorator(sr);
		//���˳ɼ�������˵��
		sr = new SortDecorator(sr);
		//��һ�³ɼ���
		sr.report();
		sr.sign("����");
	}
}