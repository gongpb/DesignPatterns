package com.Decorator.schoolReport;

/**
 * 最高成绩单修饰 
 * @author gong_pibao
 */
public class HighScoreDecorator extends Decorator{
	//构造方法
	public HighScoreDecorator(SchoolReport sr){
		super(sr);
	}
	//汇报最高成绩
	private void reportHightScore(){
		System.out.println("这次考试最高成绩   语文是80 ， 数学是 90");	
	}
	//看成绩单之前，告诉他最高成绩
	@Override
	public void report() {
		this.reportHightScore(); //最高成绩
		super.report();
	}
}
