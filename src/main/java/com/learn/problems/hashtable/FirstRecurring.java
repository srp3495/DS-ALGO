package com.learn.problems.hashtable;

import java.util.HashSet;
import java.util.Set;

//using SET here
public class FirstRecurring {

    public static void main(String args[]) {
        int[] arr = {1, 3, 7, 5, 8, 9, 0, 5};
        int recurring= findFirstRecurring(arr);
        System.out.println(recurring);

    }

    private static int findFirstRecurring(int[] a){

        Set unique=new HashSet();
        int i=0;
        while(i<a.length){
            unique.add(a[i]);
            i++;
            if(unique.size()<i){return a[i-1];}
        }
        return 0;
    }


}
