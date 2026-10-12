package Recursion;

import java.util.Scanner;

public class LCM_of_No {
	static int fxn(int a,int b) {
		if(b==0) {
			return a;
		}
		
		return fxn(b,a%b);
		
	}
	static int  lcm(int a,int b) {
		int g=fxn(a,b);
		return (a*b)/g;
	}
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int lcm=fxn(a,b);
			System.out.println(lcm);
			sc.close();
		}
}
