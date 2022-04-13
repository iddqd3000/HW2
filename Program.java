package com.company;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;


public class Program {

    public static void main(String[] args) {
        Point point = new Point(3,4);
        point.translate(1,3);
        point.scale(0.5);


        int twoDimArray[][] = {{ 16, 3, 2, 13, },{5, 10, 11, 8 },{9, 6, 7, 12},{4, 15, 14, 1}};
        int arrayLen = twoDimArray.length;
        System.out.println("Chapter1 ex 6:"+ factorial(1000));
        System.out.println("Chapter1 ex 13:"+ lotery());
        System.out.println("Chapter1 ex 14:"+ MagicSquare(twoDimArray,arrayLen));
        System.out.println("Chapter2 ex 5: "+point.getX()+", "+point.getY());

    }
    //Chapter 1 ex 2:
    public static int normAngle(int x){
        // return Math.abs (x%360);
        return Math.floorMod(x,360);

    }
    //Chapter 1 ex 8
    public static ArrayList<String> subString(String a){
        ArrayList<String> substrings = new ArrayList<>();
        for(int i = 0;i>a.length(); i++){
            substrings.add(a.substring(i));

        }
        return substrings;
    }






    //Chapter 1 ex 6:
    public static BigInteger factorial(int n) {
        BigInteger.valueOf(n);
        if (n <= 1) { // условиe выхода из рекурсии
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }
    //Chapter 1 ex 13:

    public static ArrayList<Integer> lotery() {
        ArrayList<Integer> rlist = new ArrayList<>();
        for (int i = 1; i < 6 + 1; i++) {
            double x = Math.random() * 49;
            if (rlist.contains((int) x) != true) {
                rlist.add((int) x);
            }
        }
        Collections.sort(rlist);
        return rlist;
    }

    //Chapter 1 ex 14:
    public static String MagicSquare(int x[][], int n){
        int d1 = 0;
        int d2 = 0;
        int lineSum = 0;
        int columnSum = 0;
        for(int i = 0; i<n;i++){
            d1 = d1 +x[i][i];
            d2 = d2 +x[i][i];
        }
        if(d1 != d2){

            return "Not magick square";
        }
        for(int i = 0; i<n;i++){
            for (int j = 0; j < n; j++){
                lineSum = lineSum + x[i][j];
                columnSum = columnSum + x[j][i];
            }
        }
        if (lineSum != columnSum ){

            return  "Not magick square";
        }
        return "Magick square";
    }

}


