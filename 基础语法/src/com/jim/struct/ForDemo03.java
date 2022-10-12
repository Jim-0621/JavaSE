package com.jim.struct;

public class ForDemo03 {
    //用while或for循环输出1-1000之间能被5整除的数，并且每行输出3个
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
                n++;
                if(n%3==0) System.out.println();
            }
        }

        //println 输出换行
        //print 输出不换行
    }
}
