  package com.vositor.emp;

public class CommonEmployee extends Employee{
	//��������
	private String job;

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	protected String getOtherInfo(){
		return "������"+this.job+"\t";
	}
}
