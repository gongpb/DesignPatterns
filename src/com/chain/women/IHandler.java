package com.chain.women;

/**
 * 有处理权的人员接口
 * @author gong_pibao
 */
public interface IHandler {
	//一个女性要求逛街，你要处理这个请求
	public void HandleMessage(IWomen women);
}
