package com.composite.composite;

import java.util.ArrayList;

/**
 * 树枝构件
 * @author gong_pibao
 */
public class Composite  extends Component{
	//构件容器
	private ArrayList<Component> componentList = new ArrayList<Component>();
	//增加一个子叶构件或者 树枝构件
	public void add(Component component){
		this.componentList.add(component);
	}
	//删除一个紫叶儿构件或者树枝构件
	public void remove (Component component){
		this.componentList.remove(component);
	}
	//获取分支下的所有子叶构件或者树枝构件
	public ArrayList<Component> getChildren (){
		return this.componentList;
	}
	
}
