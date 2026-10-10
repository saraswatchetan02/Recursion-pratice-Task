package Recursion;

import java.util.Scanner;

public class pallindrome {
static int fxn(int n,int rem) {
	if(n==0) {	
		return rem;
	}
	
		int temp=n%10;
		rem=rem*10+temp;		
	return fxn(n/10,rem);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int rev= fxn(n,0);
	
	 if (n == rev) {
         System.out.println("Palindrome");
     } else {
         System.out.println("Not Palindrome");
     }

     sc.close();
}
}
