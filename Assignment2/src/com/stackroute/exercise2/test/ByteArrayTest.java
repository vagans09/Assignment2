package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.exercise2.code.ByteArray;

public class ByteArrayTest {

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
	

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
	
	}

	@Test
	public void test() {
	     File folder1 = new File("/home/vadhana/Documents/workspace-sts-3.9.5.RELEASE/Assignment2/src/com/stackroute/exercise2/code/");
	     assertEquals("stackroute",ByteArray.FileRead(folder1));
	}

	
	

}
