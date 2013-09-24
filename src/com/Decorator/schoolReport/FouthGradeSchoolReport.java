package com.Decorator.schoolReport;

public class FouthGradeSchoolReport extends SchoolReport{

	@Override
	public void report() {
		//成绩单的格式是这个样子的
		System.out.println("最经的XXX家长：");
		System.out.println("  ---------   ");
		System.out.println("  语文65  数学68  体育 98  自然 93   ");
		System.out.println("  ---------   ");
		System.out.println("              家长签名");
	}

	@Override
	public void sign(String name) {
		
		System.out.println("家长签名为：" + name);
		
	}

}
