package com.stackroute.exercise2.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import com.stackroute.exercise2.code.Frequency;


import org.junit.Test;

public class FrequencyTest {
 private Frequency freq;
	@Test
public void testFrequency() throws FileNotFoundException {
        
        Map<String, Integer> words = new HashMap<String, Integer>();
        String path ="/home/vadhana/Documents/workspace-sts-3.9.5.RELEASE/Assignment2/bin/com/stackroute/exercise2/code/demo.txt";

        String expected="{sleep=1, a=2, home.=1, like=1, have=1, i=3, man=1, to=1, am=1, ,=2}";
        assertEquals(expected,freq.FrequencyWord(path,words));
        }

}
