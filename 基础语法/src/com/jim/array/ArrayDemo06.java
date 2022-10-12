package com.jim.array;


import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] arrays = {1,57,57,1101,92};

        //打印数组元素Arrays.toString
        System.out.println(Arrays.toString(arrays));
        printArrays(arrays);

        //对数组排序后输出，默认是升序
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

        //填充数组元素
        Arrays.fill(arrays,2,4,0);
        System.out.println(Arrays.toString(arrays));
    }

    //重复造轮子
    public static void printArrays(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(i==0) {
                System.out.print("["+a[i]+", ");
            }else if(i== a.length-1){
                System.out.print(a[i]+"]");
            }else {
                System.out.print(a[i]+", ");
            }
        }
        System.out.println();
    }
}
