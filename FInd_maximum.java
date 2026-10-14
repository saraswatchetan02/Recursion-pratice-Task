package Recursion;

public class FInd_maximum {
static int fxn(int arr[],int max,int i) {
	if(i>arr.length-1) {
		return max;
	}
	if(arr[i]>max) {
		max=arr[i];
	}
	return fxn(arr,max,i+1);
	
	
}
public static void main(String[] args) {
	int arr[]= {1,5,9,3,7};
	int max1=fxn(arr,0,0);
	System.out.println(max1);
}
}
