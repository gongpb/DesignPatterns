package com.command.group;

public class CodeGroup extends Group{

	@Override
	public void add() {
		System.out.println("�ͻ�Ҫ������һ���");
	}

	@Override
	public void delete() {
		System.out.println("�ͻ�Ҫ��ɾ��һ���");
		
	}

	@Override
	public void find() {
		System.out.println("�ҵ�������");
		
	}

	@Override
	public void plan() {
		System.out.println("�ͻ�Ҫ��������ƻ�");
		
	}

	@Override
	public void update() {
		System.out.println("�ͻ�Ҫ���޸�һ���");
		
	}
	
}
