package com.tik_tok_practice;
/*
    Aim:To solve the issue at the Tik Tok
    There was a math teacher who said that there was only one situation
    which five numbers(<10)'factorial and plus them together to 40585.
    So I wanna check whether there are some other situations about it.
*/
public class Demo01 {
    public static void main(String[] args) {
        //define two arrays to save these five numbers and five results of factorials
        int []num = new int[5];
        int []multiples = new int[5];
        //implement via circulating
        //Violent enumeration
        for(num[0] = 9; num[0]>=1; num[0]--) {
            multiples[0] = factorial(num[0]);
            for(num[1] = 9; num[1]>=1; num[1]--) {
                multiples[1] = factorial(num[1]);
                for (num[2] = 9; num[2]>=1; num[2]--) {
                    multiples[2] = factorial(num[2]);
                    for (num[3] = 9; num[3]>=1; num[3]--) {
                        multiples[3] = factorial(num[3]);
                        for (num[4] = 9; num[4]>=1; num[4]--) {
                            multiples[4] = factorial(num[4]);
                            if(multiples[0] + multiples[1] + multiples[2] +multiples[3] +multiples[4] == 40585) {
                                System.out.println("40585 = " + num[0] + "! +" + num[1] + "! +" + num[2] + "! +" + num[3] + "! +" + num[4] + "!");
                                //The elimination of duplicate results was not considered
                            }
                        }
                    }
                }
            }
        }
    }
    //Determine if the results are repeated
    /*public static boolean judge() {
        return ;
    }*/

    //Calculate the order multiplier method
    public static int factorial(int a) {
        int b;
        int muliple = 1;
        for(b = a; b>=1; b--) {
            muliple*=b;
        }
        return muliple;
    }
}
