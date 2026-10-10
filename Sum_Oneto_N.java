package Recursion;

import java.util.Scanner;

public class Sum_Oneto_N {
	static void fxn(int i,int n,int sum) {
		
		if(i>n) {
			System.out.println(sum);
			return;
		}
			sum+=i;
			fxn(i+1,n,sum);
		}
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fxn(1,n,0);
	}
}
