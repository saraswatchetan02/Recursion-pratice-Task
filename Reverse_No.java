package Recursion;

import java.util.Scanner;

public class Reverse_No {
static int fxn(int n,int rev) {
	if(n==0) {
		return rev;
		
	}
	int rem=n%10;
	rev=rev*10+rem;
	return fxn(n/10,rev);
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	fxn(n,0);
	 int result = fxn(n, 0);

     System.out.println(result);
}
}
