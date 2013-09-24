package com.chain.women2;

public class Husband extends  Handler{
	//丈夫只是处理妻子的请示
	public Husband() {
		super(Handler.HUSBAND_LEVER_REQUEST);
	}
	//丈夫的答复
	@Override
	protected void response(IWomen women) {
		System.out.println("------妻子向丈夫请示------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的答复：同意\n");
	}


}
