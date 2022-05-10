package com.ecpe205;

import java.util.Arrays;

public class Calculator {
    public double sum(double a, double b) {
      return a + b;
    }
    public boolean isEven (int value) {
        return value % 2 == 0;
    }
    public boolean isOdd (int value) {
        return value % 2 == 1;
    }

    public int factorial(int n){
        int hold=1;

        for(int i=1;i<=n;i++){
            hold=hold*i;
        }
        return hold;

    }
    public String Palindrome(String x){
        String reverseStr = "";

        int strLength = x.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + x.charAt(i);
        }

        return reverseStr.toLowerCase();
    }

    public double Power(double a, double b){

        return Math.pow(a,b);
    }

    public int[] Sorting(int[] input){
        int [] temp = input;
        Arrays.sort(temp);


        return temp;

    }
}
