package Recursion;

import java.util.Scanner;

public class Count_Occurrence {
static int fxn(String str,char ch,int c,int i) {
	if(i==str.length()) {
		return c;
	}
	
	if(str.charAt(i)==ch) {
		c++;
	}
	return fxn(str,ch,c,i+1);
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	 char ch = sc.next().charAt(0);
	 int count=fxn(str,ch,0,0);
	 System.out.println(count);
	 sc.close();
}
}
