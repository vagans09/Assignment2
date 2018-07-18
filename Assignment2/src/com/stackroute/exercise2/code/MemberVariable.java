package com.stackroute.exercise2.code;
import com.stackroute.exercise2.code.Member;
public class MemberVariable {

	public static String[] displayMemberVariables(String[] strArr)
	{
	Member memObj = new Member();
	memObj.age=30;
	memObj.name="Harry Potter";
	memObj.salary =(float)2500.3;
	String str=strArr[0].concat(memObj.name).concat(",").concat(strArr[1]).concat(Float.toString(memObj.salary)).concat(",").concat(strArr[2]).concat(Integer.toString(memObj.age));
	return str.split(",");
	}
	}


