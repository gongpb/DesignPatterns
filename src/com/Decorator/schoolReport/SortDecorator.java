package com.Decorator.schoolReport;

/**
 *排名情况修饰
 * @author gong_pibao
 */
public class SortDecorator extends Decorator{

	//构造方法
	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	private void reportSort(){
		System.out.println("我的排名是38名.............");
	}
	//老爸看完成绩单后，再告诉他，加强作用
	@Override
	public void report() {
		super.report();
		this.reportSort();  //排名
	}
}
