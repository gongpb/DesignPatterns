package com.principle.lod.distance;

public class SoftWareInstallation {
	public void install(SoftWare softWare){
		int first = softWare.first();
		if (first >50) {
			int second = softWare.second();
			if (second > 50) {
				softWare.third();
			}
		}
	}
}