package com.learn.algorithm;

public class BubbleSort {
	
	
	
	
	public static void sort(int[] arr,int k) {
		int p=k;
		while(k>1) {
			for(int i=0;i<k-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					
				}
			  
				
			}
			k--;
	}
		
		System.out.println("Output from bubble sort");
		for(int q=0;q<p;q++) {
			System.out.println(arr[q]);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,5,7,1,4,8,9,4,6,77,98,34,34,543,22,114,455,675,4,66,9,0};
		int k=arr.length;
		sort(arr,k);
	}

}
