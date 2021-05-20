package com.itluguo_01;

import java.util.Scanner;
public class Chapter4OperatorTest02 {
    public static void main(String[] args) {
        System.out.println("1：数学");
        System.out.println("2：语文");
        System.out.println("3：英语");
        System.out.println("4：物理");
        System.out.println("5：化学");
        System.out.println("请输入选择的课程号：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("您选择的是数学课程");
                break;
            case 2:
                System.out.println("您选择的是语文课程");
                break;
            case 3:
                System.out.println("您选择的是英语课程");
                break;
            case 4:
                System.out.println("您选择的是物理课程");
                break;
            case 5:
                System.out.println("您选择的是化学课程");
                break;
            default:
                System.out.println("输出有误");
        }
    }
}
