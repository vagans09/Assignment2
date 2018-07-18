package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.exercise2.code.EvenNumTest;

public class EvenNumTestCase {
 
  
	@Test
	public void testEvenNum() {
		assertEquals("even number",true,EvenNumTest.isEven(4));
		assertEquals("not even number",false,EvenNumTest.isEven(3));
	}
    
}
