package com.itluguo_01;
import java.util.Scanner;

public class HelloWorld01 {
    public static void main(String[] args) {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
