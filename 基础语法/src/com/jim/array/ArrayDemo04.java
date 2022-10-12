package com.jim.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        int[] rearrays = new int[5];
        //fori(arrays);
        for (int i = 0; i < arrays.length; i++) {
            rearrays[rearrays.length-1-i] = arrays[i];
        }
        for (int i = 0; i < rearrays.length; i++) {
            System.out.println(rearrays[i]);
        }

    }

    public static void fori(int[] arrays){
        //arrays.for+enter
        //JDK1.5以上，没有下标
        //For-each用法
        for (int array : arrays) {
            System.out.println(array);
        }
    }
}
