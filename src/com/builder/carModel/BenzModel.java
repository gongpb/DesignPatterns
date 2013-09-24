package com.builder.carModel;

public class BenzModel extends CarModel{
	@Override
	protected void alarm() {
		System.out.println("±¼³ÛÀ®°ÈÉùÒô...");
	}

	@Override
	protected void engineBoom() {
		 System.out.println("±¼³ÛÒıÇæÊÇÕâ¸öÉùÒôµÄ...");
	}

	@Override
	protected void start() {
		System.out.println("±¼³ÛÅÜÆğÀ´...");
	}

	@Override
	protected void stop() {
		System.out.println("±¼³ÛÍ£Ö¹...");
	}
	
}
