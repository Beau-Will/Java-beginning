package com.itluguo_01;

public class Chapter5ChaZhao2 {
    public static void main(String[] args) {
        //定义了一个char型的数组a
        char[] a;
        //
        a= new char[26];
        for (int i = 0; i<26; i++){
            a[i]=(char)('A' + i);
            System.out.print(a[i]);
            if(a[i] == 'Z'){
                System.out.println("");
            }
        }
    }
}
