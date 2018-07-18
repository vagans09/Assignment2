package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.exercise2.code.JavaExercise2;

public class PalindromeTest {
//Palindrome Test
	@Test
	public void testpalindrome() {
		JavaExercise2 test = new JavaExercise2();
			int output = test.palindrome(454);
			assertEquals(454,output);
	}
	
	// Power of 4 Test
	@Test
	public void testpoweroffour() {
		JavaExercise2 test = new JavaExercise2();
			int output = test.poweroffour(64);
			assertEquals(1,output);
	}
	
	

}
