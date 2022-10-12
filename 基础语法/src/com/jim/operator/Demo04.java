package com.jim.operator;

public class Demo04 {
    public static void main(String[] args) {

        // ++, -- 自增,自减 一元运算符

        int a = 3;
        int b= a++; //执行完这行代码后，先给b赋值，再自增
        // a++ a=a+1
        System.out.println(a);
        int c = ++a; //执行完这行代码前，先自增，再给c赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //恶心人系列 d=a+++++b
        int d = a++ + ++b;
        System.out.println(d);

        //很多运算，我们会使用一些工具类来操作！
        //幂运算 2^3 2*2*2=8
        //Math不用导入包
        double pow = Math.pow(2,3);
        System.out.println(pow);

    }
}
