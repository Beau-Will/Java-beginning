package com.itluguo_05;
/*
    获取最值
        获取数组中的最大值
        最小值自己完成
*/
public class ArrayTest02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {12,45,98,73,60};
        //定义一个变量，用于保存最大值
        int max;
        int min;
        //取数组中第一个数据作为变量的初始值
        max = arr[0];
        min = arr[0];
        //与数组中的剩余的数据逐个比对，每次比对将最大值保存到变量中
        for(int x = 1; x<arr.length; x++) {
            if(arr[x]>max) {
                max = arr[x];
            }
        }
        for(int x = 1; x<arr.length; x++){
            if(arr[x]<min) {
                min = arr[x];
            }
        }
        //循环结束后打印变量的值
        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}
