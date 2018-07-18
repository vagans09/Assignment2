package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.exercise2.code.MemberVariable;

public class MemberTest {
  public static MemberVariable MemberVar1;
	@Test
	public void test() {
		assertArrayEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},MemberVar1.displayMemberVariables(new String[]{"Members name:","member salary:","member age:"}));
	}

}
