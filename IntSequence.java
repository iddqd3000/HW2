package com.company;

// Chapter 3 ex. 5:

public class IntSequence {


    public static int constant(int x){
        int abc = x;
        for(int i = 1; i < Integer.MAX_VALUE;){

            abc = abc*10 + x;
        }
        return abc;
    }
}
