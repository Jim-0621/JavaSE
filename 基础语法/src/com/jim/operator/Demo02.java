package com.jim.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 12131231313133L;
        int b =123;
        short c = 10;
        byte d =8;

        System.out.println(a+b+c+d); // Long
        System.out.println(b+c+d);  //Int
        System.out.println(c+d);    //Int

        //默认转换为混合运算中最高的类型
    }

}
