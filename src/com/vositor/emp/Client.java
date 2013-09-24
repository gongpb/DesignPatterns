package com.vositor.emp;

import java.util.ArrayList;
import java.util.List;

/**
 * �ⷽ�����У�������ϰ�ֻ���뿴 ���ž����ҵ�������С���Ŀ��Կ�Ҳ���Բ�����
 * ��ʱ��ͱȽ��鷳
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		for(Employee emp:mockEmployee()){
			emp.report();
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
