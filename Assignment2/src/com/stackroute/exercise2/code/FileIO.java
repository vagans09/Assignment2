package com.stackroute.exercise2.code;
import java.io.BufferedReader;
import java.io.FileReader;
public class FileIO {
	 public static String file(String filename) {
		   try {
			FileReader file = new FileReader(filename);
	        BufferedReader reader = new BufferedReader(file);
	        String text= "";
	        String line = reader.readLine();
	        while ( line != null)
	        {
	        	text += line;
	        	line = reader.readLine();
	        }
	        return (text.toUpperCase());
		   }
		   catch (Exception e) {
			   e.printStackTrace();
		   }
		   return null;
	    }
	 public static int fileLength(String filename) {
		   try{
			FileReader file = new FileReader(filename);
	        BufferedReader reader = new BufferedReader(file);
	        String text= "";
	        String line = reader.readLine();
	        while ( line != null)
	        {
	        	text += line;
	        	line = reader.readLine();
	        }
	        return (text.length());
	    }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   return 0;
	 }
	}
