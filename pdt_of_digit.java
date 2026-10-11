package Recursion;

import java.util.Scanner;

public class pdt_of_digit {
	static int fxn(int n,int pdt) {
		if(n==0) {
			return pdt;
		}
		int rem=n%10;
		pdt*=rem;
		return fxn(n/10,pdt);
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int pdt=fxn(n,1);
			System.out.println(pdt);
		}

}
