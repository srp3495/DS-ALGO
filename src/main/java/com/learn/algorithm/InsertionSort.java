package com.learn.algorithm;

public class InsertionSort {

	public static void sort(int[] arr,int n) {
		
		int key;
		int j;
		for(int i=1;i<n;i++) {
			key=arr[i];
			j=i-1;

			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				arr[j]=key;
				j=j-1;
			
			}
			
		
		}
		
		for(int k=0;k<n;k++) {
		System.out.println(arr[k]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {2,5,7,1,4,8,9,4,6,77,98,34,34,543,22,114,455,675,4,66,9,0};
		int k=arr.length;
		sort(arr,k);

	}

}
