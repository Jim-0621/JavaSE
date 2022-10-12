package com.exception.Test;

public class Test {
    //可能会存在异常的方法
    static  void test(int a) throws MyException{
        if(a>10){
            throw new MyException(a);
        }

        System.out.println(a+"is OK");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (Exception e) {
            //增加一些处理异常的代码块
            System.out.println("我的异常是"+e);
        }
    }
}
