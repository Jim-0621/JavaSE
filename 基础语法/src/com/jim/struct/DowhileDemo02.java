package com.jim.struct;

public class DowhileDemo02 {
    public static void main(String[] args) {
        int a = 0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("==========");
        do{
            System.out.println(a);
            a++;
        }while(a<0);
    }
}
