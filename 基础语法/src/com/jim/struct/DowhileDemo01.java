package com.jim.struct;

public class DowhileDemo01 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        //至少执行一次
        do{
            sum += i;
            i++;
        }while (i<1);
        System.out.println(sum);
    }
}
