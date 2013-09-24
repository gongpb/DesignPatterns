package com.mediator.mediator;
/**
 * @author gong_pibao
 * 抽象同事类
 * 每一个同事角色都知道中介者角色，而且与其他的同事角色通信的时候，一定要通过中介者角色协作。
 * 每个同事的行为分为两种：一种是同事本身的行为，比如改变对象本身的状态，处理自己的行为等，
 * 这种方法叫做自发行为(self-Method)，与其他的同事类或者中介类没有任何的依赖；
 * 第二种是必须依赖中介者才能完成的行为，叫做依赖方法(Dep-Method)
 */
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
