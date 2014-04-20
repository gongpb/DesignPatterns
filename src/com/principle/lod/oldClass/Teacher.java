package com.principle.lod.oldClass;

import java.util.ArrayList;
import java.util.List;

import com.principle.lod.Girl;

public class Teacher {
	public void commond(GroupLoader loader) {
		List<Girl> girlList = new ArrayList<Girl>();
		for (int i=0; i<20; i++) {
			girlList.add(new Girl());
		}
		loader.countGirls(girlList);
	}
}
