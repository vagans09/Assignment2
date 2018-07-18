package com.stackroute.exercise2.test;
import com.stackroute.exercise2.code.FileIO;
import static org.junit.Assert.*;

import org.junit.Test;

public class FileIOTest {
	public static FileIO fileIo;

	@Test
	public void test() {
	String expected = "STACKROUTE";
	String filename = "/home/vadhana/Documents/workspace-sts-3.9.5.RELEASE/Assignment2/src/com/stackroute/exercise2/code/text.txt";
	assertEquals(expected,fileIo.file(filename));
	}
	@Test
	public void testlength() {
	int expected = 10;
	String filename = "/home/vadhana/Documents/workspace-sts-3.9.5.RELEASE/Assignment2/src/com/stackroute/exercise2/code/text.txt";
	assertEquals(expected,fileIo.fileLength(filename));
	}

}
