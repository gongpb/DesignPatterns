  package com.vositor.emp3;

public class CommonEmployee extends Employee{
	//��������
	private String job;

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
