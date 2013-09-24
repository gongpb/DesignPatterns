package com.Decorator.schoolReport;

/**
 * 修饰的抽象类
 * 抽象类的作用就是封装 SchoolReport 类
 * @author gong_pibao
 */
public abstract class Decorator extends SchoolReport{
	//首先知道哪个成绩单
	private SchoolReport sr ;
	//构造方法，传递成绩单过来
	public Decorator(SchoolReport sr){
		this.sr = sr;
	}
	//查看成绩单
	@Override
	public void report() {
		this.sr.report();
	}
    //看完成绩单要签名
	@Override
	public void sign(String name) {
		this.sr.sign(name);
	}

}
