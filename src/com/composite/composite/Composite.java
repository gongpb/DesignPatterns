package com.composite.composite;

import java.util.ArrayList;

/**
 * ��֦����
 * @author gong_pibao
 */
public class Composite  extends Component{
	//��������
	private ArrayList<Component> componentList = new ArrayList<Component>();
	//����һ����Ҷ�������� ��֦����
	public void add(Component component){
		this.componentList.add(component);
	}
	//ɾ��һ����Ҷ������������֦����
	public void remove (Component component){
		this.componentList.remove(component);
	}
	//��ȡ��֧�µ�������Ҷ����������֦����
	public ArrayList<Component> getChildren (){
		return this.componentList;
	}
	
}
