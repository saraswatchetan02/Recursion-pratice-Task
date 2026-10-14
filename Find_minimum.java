package Recursion;

public class Find_minimum {
	static int fxn(int arr[],int min,int i) {
		if(i>arr.length-1) {
			return min;
		}
		if(arr[i]<min) {
			min=arr[i];
		}
		return fxn(arr,min,i+1);	
	}
	public static void main(String[] args) {
		int arr[]= {1,5,9,3,7};
		int min1=fxn(arr,Integer.MAX_VALUE,0);
		System.out.println(min1);
}
}