package com.exception;

public class Demo02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        //选中sout，ctrl+alt+t
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("hhh");
            e.printStackTrace();
        }finally {

        }
    }
}
