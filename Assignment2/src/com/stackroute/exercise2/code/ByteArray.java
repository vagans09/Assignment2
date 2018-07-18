package com.stackroute.exercise2.code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteArray {

    public static String FileRead( File folder) {
         String string="";
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {

            	FileRead(fileEntry);
            } else {
                String name = fileEntry.getName();
                if (name.endsWith(".txt")) {
                    System.out.println(name);
                    String fullName = "/home/vadhana/Documents/workspace-sts-3.9.5.RELEASE/Assignment2/src/com/stackroute/exercise2/code/";
                    fullName = fullName.concat(name);
                    InputStream fileinput = null;
                    try {
                        fileinput = new FileInputStream(fullName);
                        byte file_content[] = new byte[1024];
                        int read_count = 0;
                        while ((read_count = fileinput.read(file_content)) > 0) {
                        
                    string =string .concat((new String(file_content, 0, read_count - 1)));
                    
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fileinput != null)
                                fileinput.close();
                        } catch (Exception ex) {

                        }
                    }
}
            }
        }
        return string;
    }
}
