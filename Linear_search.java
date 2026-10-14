package Recursion;

import java.util.Scanner;

public class Linear_search {
static int linear(int arr[],int target,int idx) {
	if(idx==arr.length-1) {
		return -1;
	}
	if(arr[idx]==target) {
		return idx;
	}
	return linear(arr,target,idx+1);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]= {1,5,2,4,9,6};
	int target=sc.nextInt();
	int found=linear(arr,target,0);
	System.out.println(found);
	
}}
