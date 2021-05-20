package com.itluguo_01;

public class Chapter4OperatorTest01_model {
    public static void main(String[] args) {
        int i;
        int j;
        int sum;
        for (i = 1; i<=9; i++) {
            for(j = 1; j<=i; j++) {
                sum = i + j;
                System.out.print(i + "+" + j + "=" + sum + " ");
            }
            System.out.println("");
        }

    }
}
