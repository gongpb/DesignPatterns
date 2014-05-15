package com.Decorator.schoolReport;

/**
 * 查看修饰后的成绩单
 * @author gong_pibao
 */
public class Father {
	public static void main(String [] args ){
		SchoolReport sr ;
		//原装的成绩单
		sr = new FouthGradeSchoolReport();
		//加了最高分说明的成绩单
		sr = new HighScoreDecorator(sr);
		//加了成绩排名的说明
		sr = new SortDecorator(sr);
		//看一下成绩单
		sr.report();
		sr.sign("张三");
	}
}