package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exercise2.code.StudentAverage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class StudentAverageTest {
 private static  StudentAverage studentaveragetest;
 

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentaveragetest = new StudentAverage();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentaveragetest = null;
	}
	@Test
	public void teststudentaverage() {
		int[] a1= {86,65,98,77};
        float actual=studentaveragetest.StudentAvg(a1);
        float expected = (float)81.5;
        assertEquals(expected,actual,0.001);
	}
 @Test
 public void testMax() {
	 int[] a1= {86,65,98,77};
	 assertEquals(98,studentaveragetest.Maximum(a1));
 }
 
 @Test
 public void testMin() {
	 int[] a1= {86,65,98,77};
	 assertEquals(65,studentaveragetest.Minum(a1));
 }
}
