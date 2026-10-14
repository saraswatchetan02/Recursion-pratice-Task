package Recursion;

import java.util.Scanner;

public class Binary_search {
static int binarysearch(int arr[],int left,int right,int target) {
if(left>right) {
	return -1;
}
int mid=left+(right-left)/2;
if(arr[mid]==target) {
	return mid;
}
if(arr[mid]>target) {
	return binarysearch(arr,left,mid-1,target);
}
else {
	return binarysearch(arr,mid+1,right,target);
}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int target=sc.nextInt();
	int found=binarysearch(arr,0,n-1,target);
	System.out.println("Element found at "+found);
}
}
