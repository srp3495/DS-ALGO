package com.learn.problems.array;

public class MergeSortedArrays {

    public static void main(String[] args){

        int[] arr1={1,4,5,7,9};
        int[] arr2=new int[]{0,6,7,8,9};

        int[] arr3=merge(arr1,arr2);
        for(int k=0;k<arr3.length-1;k++)
        System.out.print(arr3[k]);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
       if(arr1.length==0&&arr2.length==0){
           return null;
       }
       if(arr1.length==0){
           return arr2;
       }
       if(arr2.length==0){
           return arr1;
       }
       int item1=arr1[0];
       int item2=arr2[0];
       int i=0;
       int j=0;
       int k=0;
       int msize=arr1.length+arr2.length;
       int[] mergedArray=new int[msize];//9

       while(j<msize) {
           if (item1 <= item2) {
               mergedArray[j] = item1;
               i++;
               if(i<arr1.length)item1 = arr1[i];
               j++;
           } else {
               mergedArray[j] = item2;
               k++;
               if(i<arr2.length)item2 = arr2[k];
               j++;

           }
       }
return mergedArray;
    }
}
