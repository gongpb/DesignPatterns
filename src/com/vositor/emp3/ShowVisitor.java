package com.vositor.emp3;

public class ShowVisitor implements IShowVisitor{
	private String info = "";
	//��ӡ������
	@Override
	public void report() {
		System.out.println("��ʾ����"+this.info);
	}
	
	//��װ������Ϣ
	public String getBasicInfo(Employee employee){
		String info = "������" + employee.getName() +"\t";
		info = info + "�Ա�" + (employee.getSex()==Employee.FEMALE?"Ů":"��") +"\t" ;
		info = info + "нˮ��" + employee.getSalary() +"\t";
		return info;
	}
	//������ͨԱ������װ��Ϣ
	@Override
	public void visit(CommonEmployee commonEmployee) {
		this.info = this.info + this.getBasicInfo(commonEmployee);
		this.info = this.info + "������" + commonEmployee.getJob() +"\t\n";
	}
	//���ʲ��ž�����װ��Ϣ
	@Override
	public void visit(Manager manager) {
		this.info = this.info + this.getBasicInfo(manager);
		this.info = this.info + "������" + manager.getPerformance() +"\t\n";
	}

}
