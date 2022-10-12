package com.jim.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers ={10,20,30,40}; //定义了一个数组

        for (int i = 0; i < 4; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("=================");

        //遍历数组的元素
        for(int n:numbers){
            System.out.println(n);
        }
    }
}
