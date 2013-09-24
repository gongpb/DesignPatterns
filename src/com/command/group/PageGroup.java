package com.command.group;

public class PageGroup extends Group{

	@Override
	public void add() {
		System.out.println("客户要求增加一个页面");
	}

	@Override
	public void delete() {
		System.out.println("客户要求删除一个页面");
	}

	@Override
	public void find() {
		System.out.println("找到美工组");
	}

	@Override
	public void plan() {
		System.out.println("客户要求页面变更计划");
	}

	@Override
	public void update() {
		System.out.println("客户要求修改夜歌页面");
	}

}
