  package com.vositor.emp;

public class CommonEmployee extends Employee{
	//工作内容
	private String job;

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	protected String getOtherInfo(){
		return "工作："+this.job+"\t";
	}
}
