package com.vositor.emp2;

public class Visitor implements IVisitor {
	// ��ͨԱ��
	@Override
	public void visit(CommonEmployee commonEmployee) {
		System.out.println(this.getCommonEmployeeInfo(commonEmployee));
	}

	// ���ž���
	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	// ��װ���ž������Ϣ
	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "ҵ����" + manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}

	// ��װ��ͨԱ������Ϣ
	private String getCommonEmployeeInfo(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "������" + commonEmployee.getJob();
		return basicInfo + otherInfo;
	}

	// ��װ������Ϣ
	public String getBasicInfo(Employee employee) {
		String info = "������" + employee.getName() + "\t";
		info = info + "�Ա�" + (employee.getSex() == Employee.FEMALE ? "Ů" : "��") + "\t";
		info = info + "нˮ��" + employee.getSalary() + "\t";
		return info;
	}
}
