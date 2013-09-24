package com.composite.company;

import java.util.ArrayList;

/**
 * 根节点接口
 * @author gong_pibao
 */
public interface IRoot {
	//获取总经理的信息
	public String getInfo();
	//总经理下面有小兵，要增加小兵，如研发部门经理，这个事树枝节点
	public void add(IBranch branch);
	//增加树叶节点
	public void add(ILeaf leaf);
	//能够遍历，让总经理知道他手下有那些人
	public ArrayList getSubordinateInfo();
}
