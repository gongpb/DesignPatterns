package com.command.group;

public class DeletePageCommand extends Command{
	//ִ��һ��ɾ��ҳ�������
	@Override
	public void execute() 
	{	//�ҵ�������
		super.pg.find();
		//ɾ��һ��ҳ��
		super.pg.delete();
		//�����ƻ�
		super.pg.plan();
	}
}
