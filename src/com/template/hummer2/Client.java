package com.template.hummer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author gong_pibao
 * 外界条件改变，影响到模板方法的执行。我们在抽象类中isAlarm的返回值 
 * 就是影响了模板方法的执行结果，该方法叫做钩子方法(hook Method)，
 * 有了钩子方法，模板方法模式才算完美，想想看，由于子类的一个方法返回值，
 * 决定了公共部分的执行结果，是不是很有吸引力啊！
 */
public class Client {
	public static void main(String[] args) throws IOException{
		System.out.println("----------H1型号-------------");
		System.out.println("H1型号悍马是否需要喇叭声响？0--不需要       1--需要");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		HummerH1Model h1 = new HummerH1Model();
		if("0".equals(type)){
			h1.setAlarm(false);
		}
		h1.run();
		System.out.println("----------H2型号-------------");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}
