package com.command.group;

public abstract class Command {
	protected RequirementGroup rg = new RequirementGroup(); //������
	protected PageGroup pg = new PageGroup(); //������
	protected CodeGroup cg = new CodeGroup(); //������
	//ֻ��һ���취����Ҫ����ʲô����
	public abstract void execute();
	
}
