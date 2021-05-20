package com.itluguo_01;

public class Chapter4testFor3 {
    public static void main(String[] args) {
        int i;
        int j;
        int input = 10;
        System.out.println("正三角：");
        for (i = 1; i<=input; i++)
        {
            for(j = i; j<input; j++)
            {
                System.out.print(" ");
            }
            //打印左半边三角
            for(j = i; j>=1; j--)
            {
                if (j >= 10)
                    System.out.print("*"); //大于9的数字用"*"符号表示
                else
                    System.out.print(j); //如果要全部打印"*"号，此处将"j"用"*"
                                           //代替
                                           //下面的程序做相同的改动
            }
            //打印右半边三角
            for (j = 2; j<= i; j++)
            {
                if (j >= 10)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
