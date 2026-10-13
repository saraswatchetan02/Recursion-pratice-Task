package Recursion;

import java.util.Scanner;

public class Check_If_array_sorted {
static boolean fxn(int left,int n,int arr[]){
if(left>=n-1)	{
	return true;
}
if(arr[left]>arr[left+1]) {
	return false;
}

return fxn(left+1,n,arr);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=sc.nextInt();
}
boolean flag=fxn(0,n,arr);
if(flag) {
	System.out.println("Array is sorted");	
}
else {
	System.out.println("Array is not sorted");
}
sc.close();
}
}
