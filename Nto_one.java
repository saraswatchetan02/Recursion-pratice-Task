package Recursion;

import java.util.Scanner;

public class Nto_one {
static void fxn(int i,int n) {
if(i<1) {
	return;
}
System.out.println(i);
fxn(i-1,n);
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	fxn(n,n);
}
}
