package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exercise2.code.Factorial;
import com.stackroute.exercise2.code.StudentAverage;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FactorialTest {
private static Factorial facto;

@BeforeClass
public static void setup() {
	// This methods runs, before running any one of the test case
	// This method is used to initialize the required variables
	facto = new Factorial();

}

@AfterClass
public static void teardown() {
	// This method runs, after running all the test cases
	// This method is used to clear the initialized variables
	facto = null;
}

	@Test
	 public void testIntFact() {
	 

	     assertEquals(479001600 ,facto.printFactorials(1,1));
	 }
	 @Test
	 public void testLongFact() {
	     long m=1L;
	     long n=1L;
	     long o=2432902008176640000L;
	     

	     assertEquals(o,facto.LongFactorials(m,n));
	 }
	    

}
