package com.vositor.emp3;

public class TotalVisitor implements ITotalVisitor{
	//���ž���Ĺ���ϵ����5
	public final static int MANAGER_COEFFICIENT = 5;
	//Ա���Ĺ���ϵ����2
	public final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	//��ͨԱ���Ĺ����ܺ�
	private int commonTotalSalary = 0;
	//���ž���Ĺ����ܺ�
	private int managerTotalSalary = 0;

	@Override
	public void totalSalary() {
		System.out.println("����˾���¹����ܶ��ǣ�"
				+this.commonTotalSalary + this.managerTotalSalary);
	}
	//������ͨԱ���������ܹ���
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.commonTotalSalary = this.commonTotalSalary
		     +commonEmployee.getSalary()*this.COMMONEMPLOYEE_COEFFICIENT;
	}
	//���ʲ��ž��������ܹ���
	@Override
	public void visit(Manager manager) {
		this.managerTotalSalary = this.managerTotalSalary 
			+ manager.getSalary()* this.MANAGER_COEFFICIENT;
	}

}
