package com.vositor.emp;

public abstract class Employee {
	public final static int MALE   = 0; //0 ��������
	public final static int FEMALE = 1; //1 ����Ů��
	
	private String name; 
	private int salary;
	private int sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	//��ӡ��Ա����Ϣ
	public final void report (){
		String info = "������" + this.name +"\t";
		info = info + "�Ա�" + (this.sex==FEMALE?"Ů":"��") +"\t" ;
		info = info + "нˮ��" + this.salary +"\t";
		//��ȡԱ����������Ϣ
		info = info + this.getOtherInfo();
		System.out.println("info��"+info);
	}
	
	//ƴװԱ����������Ϣ
	protected abstract String getOtherInfo();
	
}
