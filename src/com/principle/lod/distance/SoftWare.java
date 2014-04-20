package com.principle.lod.distance;

import java.util.Random;

public class SoftWare {
	private Random rand = new Random(System.currentTimeMillis());
	
	public int first () {
		return rand.nextInt();
	}
	
	public int second () {
		return rand.nextInt();
	}
	
	public int third () {
		return rand.nextInt();
	}
}