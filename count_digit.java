package Recursion;

import java.util.Scanner;

public class count_digit {
	static int fxn(int n,int count) {
		if(n==0) {
			return count;
		}
		int rem=n%10;
		count++;
		return fxn(n/10,count);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count=fxn(n,0);
			System.out.println(count);
		}

}
