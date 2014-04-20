package com.principle.lod.newClass;

import java.util.ArrayList;
import java.util.List;

import com.principle.lod.Girl;

public class GroupLoader {
	public void countGirls() {
		
		List<Girl> girlList = new ArrayList<Girl>();
		for (int i=0; i<20; i++) {
			girlList.add(new Girl());
		}
		
		System.out.println("共有女生："+girlList.size());
	}
}
