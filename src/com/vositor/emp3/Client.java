package com.vositor.emp3;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		//所有的员工
		for(Employee emp:mockEmployee()){
			emp.accept(new Visitor());
		}
		//展示报表访问者
//		IShowVisitor showVisitor = new ShowVisitor();
//		for(Employee emp:mockEmployee()){
//			emp.accept(showVisitor); //接受显示报表访问者
//		}
//		showVisitor.report();
		//汇报报表的访问者
		ITotalVisitor  totalVisitor = new TotalVisitor();
//		for(Employee emp:mockEmployee()){
//			emp.accept(totalVisitor); //接受显示报表访问者
//		}
//		totalVisitor.totalSalary();
		
	}
	//模拟出公司的人员情况，我们可以想象这个数据室通过持久层传递过来的
	public static List<Employee> mockEmployee(){
		List<Employee> empList = new ArrayList<Employee> ();
		//产生张三这个员工,
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setName("张三");
		zhangSan.setJob("高级java工程师");
		zhangSan.setSex(Employee.MALE);
		zhangSan.setSalary(2000);
		empList.add(zhangSan);
		//产生李四这个员工
		CommonEmployee liSi = new CommonEmployee();
		liSi.setName("李四");
		liSi.setJob("美工");
		liSi.setSex(Employee.FEMALE);
		liSi.setSalary(1000);
		empList.add(liSi);
		//产生一个经理
		Manager wangWu = new Manager();
		wangWu.setName("王五");
		wangWu.setPerformance("基本上是负值，但是我会拍马屁啊！");
		wangWu.setSex(Employee.MALE);
		wangWu.setSalary(5000);
		empList.add(wangWu);
		return empList;
	}
}
