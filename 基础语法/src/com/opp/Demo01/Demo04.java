package com.opp.Demo01;

public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        a(a);   //值传递，只是把值传到a方法中
        System.out.println(a);
    }

    public static void a(int a){
        a = 10;
    }
}
