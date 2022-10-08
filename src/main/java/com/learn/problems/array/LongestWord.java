package com.learn.problems.array;

public class LongestWord {

    public static void main(String[] args){

        String s="hello!#$fun&&8998989";
        String longest=GetLongest(s);
        System.out.println(longest);
    }

    private static String GetLongest(String s) {
        String[] wordArray=s.split("[^a-z^0-9]");
        int i=1;
        String longest=wordArray[0];
        while (i<wordArray.length){
            if(wordArray[i].length()>longest.length()){
                longest=wordArray[i];
                i++;
            }
            else{
               i++;
            }
        }
        return longest;
    }
}
