package com.learn.problems.array;

public class ReverseString {

    public static void main(String[] args){

        String s="hello my dear";
        String rs=Reverse(s);
        System.out.println(rs);

    }

    //o(n)
    public static String Reverse(String s){
        String s1="";
        char[] str=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+str[i];
        }
        return s1;
    }
}
