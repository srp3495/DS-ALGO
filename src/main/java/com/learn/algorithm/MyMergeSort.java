package com.learn.algorithm;

import java.util.Random;

public class MyMergeSort  
{  
	
     void merge(int[] arr, int beg, int mid, int end)  
       {  
  
        int l = mid - beg + 1;  
        int r = end - mid;  
        int i,j;  
  
        int[] LeftArray = new int [l];  
        int[] RightArray = new int [r];  
  
        for (i=0; i<l; ++i)  
        LeftArray[i] = arr[beg + i];  
  
        for (j=0; j<r; ++j)  
        RightArray[j] = arr[mid + 1+ j];  
  
  
        i = 0; j = 0;  
        int k = beg;  
        while (i < l && j < r)  
          {  
            if (LeftArray[i] <= RightArray[j])  
              {  
                arr[k] = LeftArray[i];  
                i++;  
              }  
            else  
              {  
               arr[k] = RightArray[j];  
               j++;  
              }  
            k++;  
          }  

        while (i < l)  
          {  
            arr[k] = LeftArray[i];  
            i++;  
            k++;  
          }  
  
        while (j < r)  
         {  
          arr[k] = RightArray[j];  
          j++;  
          k++;  
         }  
       
      }  
  
   void sort(int[] arr, int beg, int end)  
   {  
    if (beg < end)  
     {  
       int mid = (beg+end)/2;  
       sort(arr, beg, mid);  
       sort(arr , mid+1, end);  
       merge(arr, beg, mid, end);  
     }  
    }  

   
   
   public static void main(String[] args)  
{  
	Random random=new Random();
	
	
	
int[] arr = new int[30];
for(int i=0;i<arr.length;i++) {
	arr[i]=random.nextInt(30);
}
MyMergeSort ob = new MyMergeSort();  
ob.sort(arr, 0, (arr.length)-1); 
for(int j=0;j<arr.length;j++) {
	System.out.println(arr[j]);
}
}  
}  