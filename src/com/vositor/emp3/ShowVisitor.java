package com.vositor.emp3;

public class ShowVisitor implements IShowVisitor{
	private String info = "";
	//打印出报表
	@Override
	public void report() {
		System.out.println("显示报表："+this.info);
	}
	
	//组装基本信息
	public String getBasicInfo(Employee employee){
		String info = "姓名：" + employee.getName() +"\t";
		info = info + "性别：" + (employee.getSex()==Employee.FEMALE?"女":"男") +"\t" ;
		info = info + "薪水：" + employee.getSalary() +"\t";
		return info;
	}
	//访问普通员工，组装信息
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.info = this.info + this.getBasicInfo(commonEmployee);
		this.info = this.info + "工作：" + commonEmployee.getJob() +"\t\n";
	}
	//访问部门经理，组装信息
	@Override
	public void visit(Manager manager) {
		this.info = this.info + this.getBasicInfo(manager);
		this.info = this.info + "工作：" + manager.getPerformance() +"\t\n";
	}

}
