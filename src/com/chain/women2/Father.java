package com.chain.women2;

public class Father extends Handler{
	//父亲只是处理女儿的请示
	public Father() {
		super(Handler.FATHER_LEVER_REQUEST);
	}
	//父亲的答复
	@Override
	protected void response(IWomen women) {
		System.out.println("------女儿向父亲请示------");
		System.out.println(women.getRequest());
		System.out.println("父亲的答复：同意\n");
	}
	
}
