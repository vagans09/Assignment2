package com.stackroute.exercise2.code;

public class Factorial {
	public int printFactorials(int i,int fact) {
    while (true)
{
    System.out.printf("The factorial of %1$d is  %2$d.\n", i, fact);
    if (Integer.MAX_VALUE / fact < (i+1)) {
        System.out.printf("The factorial of %d is out of range.\n", (i+1));
        break;
    }
    i++;
    fact *= i;
}
 return fact;
 }
 
public long LongFactorials(long i,long fact)
{
while (true)
{
    System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
    if (Long.MAX_VALUE / fact < (i+1)) {
        System.out.printf("The factorial of %d is out of range.\n", (i+1));
        break;
    }
    i++;
    fact *= i;
}
return fact;
}
}
