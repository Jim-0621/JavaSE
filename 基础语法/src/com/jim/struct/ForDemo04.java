package com.jim.struct;

public class ForDemo04 {
    //打印九九乘法表
    public static void main(String[] args) {
        for(int i1 = 1;i1 < 10;i1++){
            for(int i0 = 1;i0 <= i1;i0++){
                System.out.print(i0+"*"+i1+"="+i0*i1+"\t");
            }
            System.out.println();
        }

    }
}
