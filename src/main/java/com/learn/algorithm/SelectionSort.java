package com.learn.algorithm;

public class SelectionSort {

	public static void sort(int[] arr,int n) {
		for(int i=0;i<n-1;i++) {
			int min_index=i;
			for(int j=i+1;j<n;j++) {
			if(arr[min_index]>arr[j]) { min_index=j;}
			}
			
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			
		}
		
		System.out.println("Output from selection sort");
		for(int p=0;p<n;p++) {
			System.out.println(arr[p]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,5,7,1,4,8,9,4,6,77,98,34,34,543,22,114,455,675,4,66,9,0};
		int k=arr.length;
		sort(arr,k);
	}

}
