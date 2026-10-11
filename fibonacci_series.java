package Recursion;

import java.util.Scanner;

public class fibonacci_series {
static int fxn(int n) {
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}
	return fxn(n-1)+fxn(n-2);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i = 0; i < n; i++) {
	    System.out.print(fxn(i) + " ");
	}
}
}
