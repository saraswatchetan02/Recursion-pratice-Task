package Recursion;

import java.util.Scanner;

public class EvenNo_onetoN {
static void fxn(int i,int n) {
	if(i==n) {
		return;
	}
	if(i%2==0) {
		System.out.println(i);
	}
	fxn(i+1,n);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	fxn(1,n);
}
}
