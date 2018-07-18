package com.stackroute.exercise2.code;

public class StudentAverage {
 public float StudentAvg( int a[]) {
	 float avg;
	 int total=0;
	 int num = a.length;
	 
	 for(int i=0; i<a.length; i++) {
		 total = total+a[i];
	 }
	 avg = (float)total/num;
	 return avg;
 }
 public int Maximum(int max[]) {
	 int Maxv = max[0];
	 for (int i=1; i<max.length; i++) {
		 if(max[i]>Maxv) {
			 Maxv = max[i];
		 }
	 }
	 return Maxv;
 }
 public int Minum(int min[]) {
	 int Minv = min[0];
	 for (int i=1; i<min.length; i++) {
		 if(min[i]<Minv) {
			 Minv = min[i];
		 }
	 }
	 return Minv;
 }
 
}
