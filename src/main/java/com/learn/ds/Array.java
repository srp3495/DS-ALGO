package com.learn.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    //lookup o(1) , push o(1) appending will take o(n) is adding after capacity,insert o(n), delete o(n),search o(n)
    //when multidimensional ds is required use array, otherwise list would be better
    //resize operation of ArrayList slows it down, ArrayList internally uses Array only
    //array is not type safe, we can't use generics

    //An array that is declared with the static keyword is known as static array.
    // It allocates memory at compile-time whose size is fixed. We cannot alter the static array
    //in stack memory space,memory allocated at compile time
    // good thing about static array is it's execution time

    //Dynamic array - capacity doubles when element is added exceeding capacity
    //ArrayList is an example of dynamic array //default capacity 10
    //implement a dynamic array otherwise


    public static void main(String[] args){

        //static array
        int[] StaticArr=new int[]{2,5,6};
        int[] StaticArr2={2,4,5};
        List StaticArr3= Arrays.asList(2,5,6);

        //dynamic array
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(10);
    }


}
