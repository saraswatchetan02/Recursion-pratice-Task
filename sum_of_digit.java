package Recursion;

import java.util.Scanner;

public class sum_of_digit {
static int fxn(int n,int sum) {
if(n==0) {
	return sum;
}
int rem=n%10;
sum+=rem;
return fxn(n/10,sum);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=fxn(n,0);
	System.out.println(sum);
}
}
