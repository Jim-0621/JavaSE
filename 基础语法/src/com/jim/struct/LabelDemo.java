package com.jim.struct;

public class LabelDemo {
    public static void main(String[] args) {
        //打印100-150的质数
        outer:for(int i = 100;i<151;i++){
            for(int j =2;j<i/2;j++){
                if(i % j == 0 )
                    continue outer;
            }
            System.out.print(i+"\t");
        }
    }
}
