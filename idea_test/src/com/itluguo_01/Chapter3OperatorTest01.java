package com.itluguo_01;

import java.util.Scanner;
public class Chapter3OperatorTest01 {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>=1000 && number<=9999) {
            int ge = number % 10;
            int shi = number / 10 % 10;
            int bai = number / 100 % 10;
            int qian = number / 1000;
            int sum = ge + shi + bai + qian;
            System.out.println("每一位数字相加为" + sum);
        }else {
            System.out.println("你输入的四位数有误！");
        }
    }
}

