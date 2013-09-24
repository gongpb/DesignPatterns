package com.template.hummer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author gong_pibao
 * ��������ı䣬Ӱ�쵽ģ�巽����ִ�С������ڳ�������isAlarm�ķ���ֵ 
 * ����Ӱ����ģ�巽����ִ�н�����÷����������ӷ���(hook Method)��
 * ���˹��ӷ�����ģ�巽��ģʽ�������������뿴�����������һ����������ֵ��
 * �����˹������ֵ�ִ�н�����ǲ��Ǻ�������������
 */
public class Client {
	public static void main(String[] args) throws IOException{
		System.out.println("----------H1�ͺ�-------------");
		System.out.println("H1�ͺź����Ƿ���Ҫ�������죿0--����Ҫ       1--��Ҫ");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		HummerH1Model h1 = new HummerH1Model();
		if("0".equals(type)){
			h1.setAlarm(false);
		}
		h1.run();
		System.out.println("----------H2�ͺ�-------------");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}
