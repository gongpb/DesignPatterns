package com.chain.women2;

public class Son extends  Handler{
	//儿子只是处理母亲的请示
	public Son() {
		super(Handler.SON_LEVER_REQUEST);
	}
	//儿子的答复
	@Override
	protected void response(IWomen women) {
		System.out.println("------母亲向儿子请示------");
		System.out.println(women.getRequest());
		System.out.println("儿子的答复：同意\n");		
	}
	

}
