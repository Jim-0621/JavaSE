package com.exception.Test;

//自定义的异常类
public class MyException extends Exception{
    //传递数字>10
    private int detail;

    //alt+insert 构造器
    public MyException(int a) {
        this.detail = a;
    }

    //alt+insert toString:异常的打印信息
    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
