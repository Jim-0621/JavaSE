package com.jim.struct;

public class BreakContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while(i<10){
            i++;
            if(i==3) continue;  //continue执行下一次循环
            System.out.println(i);
            if(i==6) break; //跳出当前循环
        }
    }
}
