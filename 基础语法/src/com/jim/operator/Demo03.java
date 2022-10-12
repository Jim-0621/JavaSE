package com.jim.operator;

public class Demo03 {

    public static void main(String[] args) {
        //关系运算符返回的结果： 正确，错误 布尔值
        // if
        int a = 10;
        int b = 20;
        int c = 21;

        System.out.println(c%a); //取余
        System.out.println(c/a); //取模
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
