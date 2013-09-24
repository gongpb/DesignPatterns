package com.command.group;

public abstract class Command {
	protected RequirementGroup rg = new RequirementGroup(); //需求组
	protected PageGroup pg = new PageGroup(); //美工组
	protected CodeGroup cg = new CodeGroup(); //代码组
	//只有一个办法，你要我做什么事情
	public abstract void execute();
	
}
