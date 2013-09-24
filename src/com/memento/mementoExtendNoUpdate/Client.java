package com.memento.mementoExtendNoUpdate;
/**
 * ����¼ģʽ
 * �����޸ı���֮�������
 * ��ȫ�Ǿ��Եģ�û�о��Եİ�ȫ����������refelect�����޸ı���(Memento)�����ݡ�
 * �����������ṩ��һ���µ���Ʒ�����˫�ӿ���ƣ����ǵ�һ�������ʵ�ֶ���ӿڣ�
 * ��ϵͳ���ʱ��������Ƕ���İ�ȫ���⣬������ṩ�����ӿڣ�һ����ҵ�������
 * �ӿڣ�ʵ�ֱ�Ҫ��ҵ���߼���������ӿڣ���һ���ӿ���һ���սӿڣ�ʲô������û��
 * ��Ŀ�����ṩ����ϵͳ���ģ����ʣ������������������խ�ӿڣ�����խ�ӿ�
 * û���ṩ�κβ������ݵķ�������������˵�ǱȽϰ�ȫ�ġ�
 * @author gong_pibao
 */
public class Client {
	public static void main(String[] args) {
		//���巢����
		Originator originator = new Originator();
		//���屸��¼����Ա
		Caretaker caretaker = new Caretaker();
		//��ʼ��׳��̫
		originator.setState("��ʼ��״̬");
		System.out.println("��ʼ����"+originator.getState());
		//����һ������¼
		caretaker.setMemento(originator.createMemento());
		//�ı�״̬
		originator.setState("�ı�״̬");
		System.out.println("�޸ĺ�"+originator.getState());
		//�ָ�һ������¼
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("�ָ���"+originator.getState());
	}
}
