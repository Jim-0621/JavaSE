package com.jim.method;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    //递归
    public static int f(int n){
        if(n==1){
            return 1;
        }else{
            return n*f(n-1);
        }
    }
}
