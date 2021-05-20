package com.itluguo_01;

import java.util.Scanner;
public class HuiWenDemo {
    public static void main(String[] args) {
        System.out.println("请输入一个五位数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 99999 || num < 10000){
            System.out.println("你输入的数字有误");
        }else {
            int ge = num%10;
            int shi = num/10%10;
            int bai = num/100%10;
            int qian = num/1000%10;
            int wan = num/10000;
            if (ge == wan && shi == qian){
                System.out.println( num + "是回文数");
            } else {
                System.out.println( num + "不是回文数");
            }

        }

    }
}
