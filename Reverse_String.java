package Recursion;

import java.util.Scanner;

public class Reverse_String {
static void fxn(int i,String str,String rev) {
	if(i<0) {
		System.out.println(rev);
		return;
	}
	rev+=str.charAt(i);
	fxn(i-1,str,rev);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int n=str.length();
	fxn(n-1,str,"");
	sc.close();
}
}
