package com.composite.company2;

import java.util.ArrayList;

public interface IBranch extends ICorp {
	//增加叶子节点、或者树枝节点
	public void addSubordinate(ICorp corp);
	//获得下级信息
	public ArrayList<ICorp> getSubordinateInfo();
	/**
	 * 本来要要有一个删除下属 delSubordinateInfo(ICorp corp) 
	 * 但是这个方法我们没有用到就不用写了
	 */
}
