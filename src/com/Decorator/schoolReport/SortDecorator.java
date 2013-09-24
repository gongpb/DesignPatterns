package com.Decorator.schoolReport;

/**
 *�����������
 * @author gong_pibao
 */
public class SortDecorator extends Decorator{

	//���췽��
	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	private void reportSort(){
		System.out.println("�ҵ�������38��.............");
	}
	//�ϰֿ���ɼ������ٸ���������ǿ����
	@Override
	public void report() {
		super.report();
		this.reportSort();  //����
	}
}
