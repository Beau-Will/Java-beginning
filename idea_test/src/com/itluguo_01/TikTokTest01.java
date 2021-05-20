package com.itluguo_01;

public class TikTokTest01 {
    public static void main(String[] args) {
        int i[] = new int[5];
        long multiple[] = {1,1,1,1,1};
        for (i[0] = 0; i[0]<=9; i[0]++) {
            int j0 = i[0];
            if(j0 == 0){
                multiple[0]=1;
            }else {
                while (j0 >= 1) {
                    multiple[0] *= j0;
                    j0--;
                }
            }
            for(i[1] = 0; i[1]<=9; i[1]++){
                int j1 = i[1];
                if(j1 == 0){
                    multiple[1]=1;
                }else {
                    while (j1 >= 1) {
                        multiple[1] *= j1;
                        j1--;
                    }
                }
                for(i[2] = 0; i[2]<=9; i[2]++){
                    int j2 = i[2];
                    if(j2 == 0){
                        multiple[2]=1;
                    }else {
                        while (j2 >= 1) {
                            multiple[2] *= j2;
                            j2--;
                        }
                    }
                    for(i[3] = 0; i[3]<=9; i[3]++){
                        int j3 = i[3];
                        if(j3 == 0){
                            multiple[3]=1;
                        }else {
                            while (j3 >= 1) {
                                multiple[3] *= j3;
                                j3--;
                            }
                        }
                        for(i[4] = 0; i[4]<=9; i[4]++) {
                            int j4 = i[4];
                            if(j4 == 0){
                                multiple[4]=1;
                            }else {
                                while (j4 >= 1) {
                                    multiple[4] *= j4;
                                    j4--;
                                }
                            }

                            if(multiple[0]+multiple[1]+multiple[2]+multiple[3]+multiple[4] == 40585){
                                System.out.println("40585 ="+i[0]+"!"+i[1]+"!"+i[2]+"!"+i[3]+"!"+i[4]+"!");
                            }
                        }
                    }
                }
            }
        }
    }
}
