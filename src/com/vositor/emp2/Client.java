package com.vositor.emp2;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		for(Employee emp:mockEmployee()){
			emp.accept(new Visitor());
		}
	}
	//ģ�����˾����Ա��������ǿ����������������ͨ���־ò㴫�ݹ�����
	public static List<Employee> mockEmployee(){
		List<Employee> empList = new ArrayList<Employee> ();
		//�����������Ա��,
		CommonEmployee zhangSan = new CommonEmployee();
		zhangSan.setName("����");
		zhangSan.setJob("�߼�java����ʦ");
		zhangSan.setSex(Employee.MALE);
		zhangSan.setSalary(2000);
		empList.add(zhangSan);
		//�����������Ա��
		CommonEmployee liSi = new CommonEmployee();
		liSi.setName("����");
		liSi.setJob("����");
		liSi.setSex(Employee.FEMALE);
		liSi.setSalary(1000);
		empList.add(liSi);
		//����һ������
		Manager wangWu = new Manager();
		wangWu.setName("����");
		wangWu.setPerformance("�������Ǹ�ֵ�������һ�����ƨ����");
		wangWu.setSex(Employee.MALE);
		wangWu.setSalary(5000);
		empList.add(wangWu);
		return empList;
	}
}
