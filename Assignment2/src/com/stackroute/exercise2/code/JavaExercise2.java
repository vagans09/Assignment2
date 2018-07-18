package com.stackroute.exercise2.code;

public class JavaExercise2 {
//Palindrome program 
public int palindrome(int temp) {
	int r,sum=0,temp1;    
	  int n=454; 
	  temp1=n;    
	  while(n>0){    
	   r=n%10;  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp1==sum)    
	   System.out.println("palindrome number ");    
	  else    
	   System.out.println("not palindrome");
	return temp1;    
}
// Power of 4 program
public int poweroffour(int n)
{
	int  n1= 16;
	if(n1 == 0)
        return 0;
        while(n1 != 1)
        { 
            if(n1 % 4 != 0)
            return 0;
            n1 = n1 / 4;     
        }
        return 1;
}
}
