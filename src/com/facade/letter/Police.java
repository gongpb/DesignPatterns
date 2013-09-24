package com.facade.letter;

/**
 * 信件检查类
 * @author gong_pibao
 */
public class Police {
	//检查信件，检查完毕后警察会在信封上盖戳，此信件无病毒
	public void checkLetter(ILetterProcess letterProcess){
		System.out.println(letterProcess+"   信件已经经过检查....");
	}

}
