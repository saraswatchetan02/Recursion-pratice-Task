package Recursion;

import java.util.Scanner;

public class Factorial_till_N {
static void fxn(int i,int n,int pdt) {
	if(i>n) {
		System.out.println(pdt);
		return;
	}
	pdt*=i;
	fxn(i+1,n,pdt);
}
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	fxn(1,n,1);
}
}
