package com.command.group;

public class RequirementGroup extends Group{

	@Override
	public void add() {
		System.out.println("客户要求增加一个需求");
	}

	@Override
	public void delete() {
		System.out.println("客户要求要删除一个需求");
	}

	@Override
	public void find() {
		System.out.println("找到需求组");
	}

	@Override
	public void plan() {
		System.out.println("客户要求需求变更计划");
	}

	@Override
	public void update() {
		System.out.println("客户要求修改某一项需求");
	}

}
