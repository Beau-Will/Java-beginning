package com.itluguo_01;

public class Chapter4OperatorTest01 {
    public static void main(String[] args) {
        int i;
        int j;
        int multiple;
        for (i = 1; i<=9; i++){
            for (j = 1;j<=i; j++){
                multiple = i*j;
                System.out.print(i + "✖" + j + "=" + multiple + " ");
            }
            System.out.println("");
        }
    }
}
