package com.learn.algorithm;

public class QuickSort {
	public static int partition(int[] arr,int start,int end) {
		int pivot=arr[end];
		int p_index=start-1;
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				
				p_index++;
				int temp=arr[p_index];
				arr[p_index]=arr[i];
				arr[i]=temp;
				
				
			}
			
		
		}
		int temp1=arr[p_index+1];
		arr[p_index+1]=arr[end];
		arr[end]=temp1;
		return p_index+1;
	}
	
	public static void sort(int[] arr,int a,int b){
		
		if(a<b) {
		int p=partition(arr,a,b);
		
		
		sort(arr,a,p-1);
		sort(arr,p+1,b);
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,5,7,1,4,8,9,4,6,77,98,34,34,543,22,114,455,675,4,3,66,9,0};
		int k=arr.length;
		sort(arr,0,k-1);
		
		for(int j=0;j<k;j++) {
			System.out.println(arr[j]);
		}
	}

}
