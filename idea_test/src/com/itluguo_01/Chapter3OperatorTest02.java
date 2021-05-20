package com.itluguo_01;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Chapter3OperatorTest02 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int multiple = 1;
        while(num >= 1){
            multiple *= num;
            num--;
        }
        System.out.println("阶乘为" + multiple);
    }
}