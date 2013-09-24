package com.mediator.buyComputer2;
/**
 * 抽象同事类
 * @author gong_pibao
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague (AbstractMediator mediator){
		this.mediator = mediator;
	}
}
