package com.liujunbo.test;


import java.util.ArrayList;

public class FirstIdeaObj {
    public static void  main(String[] args){
        List<String> list = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        int[] ary = {32,34,5,43,1,43};
        for (int i = 0 ; i < ary.length ; i++){
            for (int j = 1; j <ary.length-1-i ; j++) {
                if (ary[j] < ary[j-1]) {
                    int temp = ary[j];
                    ary[j] = ary[j - 1];
                    ary[j - 1] = temp;
                }
            }
        }
        System.out.println("hello word");
        int temp1 = 200;
        System.out.println("temp1 = " + temp1);
    }
}
