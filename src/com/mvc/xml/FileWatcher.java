package com.mvc.xml;

import java.util.Observable;

public class FileWatcher extends Observable implements Watchable{
	//�Ƿ���Ҫ���¼���xml�ļ�
	private boolean isReload = false;
	//��������
	public void watch()
	{
		//����һ���̣߳�ÿ��15��ɨ��һ���ļ��������ļ����ڱ��޸ģ�����֪ͨ�۲���
		super.addObserver(new Checker());
		super.setChanged();
		super.notifyObservers(isReload);
	}
}
