package com.jim.method;

public class Demo02 {
    public static void main(String[] args) {
        int max0 = max(10,20);
        double max1 = max(10.0,20.0);
        System.out.println(max0);
        System.out.println(max1);
    }

    public static int max(int a, int b){
        int res = -1;
        if(a<b){
            res = b;
        }else if(a==b){
            System.out.println("两数相等");
            return 0;   //终止方法
        }else{
            res = a;
        }
        return res;
    }

    public static double max(double a, double b){
        double res = -1;
        if(a<b){
            res = b;
        }else if(a==b){
            System.out.println("两数相等");
            return 0;   //终止方法
        }else{
            res = a;
        }
        return res;
    }


}
