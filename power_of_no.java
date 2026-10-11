package Recursion;

import java.util.Scanner;

public class power_of_no {
static int fxn(int n,int pow1) {
	 if (pow1 == 0) {
         return 1;
     }

     return n * fxn(n, pow1 - 1);
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int pow1=sc.nextInt();
	int pow=fxn(n,pow1);
	System.out.println(pow);
	sc.close();
}
}
