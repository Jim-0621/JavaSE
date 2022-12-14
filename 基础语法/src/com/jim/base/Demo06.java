package com.jim.base;

public class Demo06 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years=20;
        int total=money*years;
        System.out.println(total); //-1474836480，计算的时候溢出了（-2147483648~2147483647）
        long total2=money*years; //默认是int，转换之前已经存在问题了
        System.out.println(total2);

        long total3=money*((long)years); //先把一个数转换为Long
        System.out.println(total3);

        // L   l   写l的时候为了防止当成1，一般都写成大写L

    }
}
