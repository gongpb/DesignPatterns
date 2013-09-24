package com.vositor.emp2;

/**
 * 该接口的意义是：我们可以访问两个对象，一个市普通员工，一个是高级员工
 * @author gong_pibao
 */
public interface IVisitor {
	//首先，定义我可以访问普通员工
	public void visit(CommonEmployee commonEmployee);
	//其次，定义我还可以访问部门经理
	public void visit(Manager manager);
}
