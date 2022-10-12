package com.jim.method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {
        int i = add(5,6);
        System.out.println(i);
    }


    //方法的命名规范：驼峰原则(开头小写，后面单词开头大写)
    public static int add(int a,int b){
        return a+b;
    }
}
