package com.builder.carModel;

import java.util.ArrayList;

/**
 * ��������
 * @author gong_pibao
 */
public abstract class CarBuilder {
	//����һ��ģ�ͣ������һ��˳��
	public abstract void setSequence(ArrayList<String> sequence);
	//�������֮��Ϳ���ֱ���õ�����ģ����
	public abstract CarModel getCarModel();
}
