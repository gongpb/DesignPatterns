package com.vositor.emp3;

public class TotalVisitor implements ITotalVisitor{
	//部门经理的工资系数是5
	public final static int MANAGER_COEFFICIENT = 5;
	//员工的工资系数是2
	public final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	//普通员工的工资总和
	private int commonTotalSalary = 0;
	//部门经理的工资总和
	private int managerTotalSalary = 0;

	@Override
	public void totalSalary() {
		System.out.println("本公司的月工资总额是："
				+this.commonTotalSalary + this.managerTotalSalary);
	}
	//访问普通员工，技术总工资
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.commonTotalSalary = this.commonTotalSalary
		     +commonEmployee.getSalary()*this.COMMONEMPLOYEE_COEFFICIENT;
	}
	//访问部门经理，计算总工资
	@Override
	public void visit(Manager manager) {
		this.managerTotalSalary = this.managerTotalSalary 
			+ manager.getSalary()* this.MANAGER_COEFFICIENT;
	}

}
