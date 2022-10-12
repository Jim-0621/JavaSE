package com.exception;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        //假设要捕获多个异常：从小到大
        try {   //try监控区域
            System.out.println(a/b);
        }catch (ArithmeticException e){ //catch(想要捕获的异常类型) 捕获异常
            System.out.println("程序出现异常！");
        }finally {  //处理善后工作
            System.out.println("finally");
        }

        //finally 可以不要finally，假设IO, 资源，关闭！
    }
}
