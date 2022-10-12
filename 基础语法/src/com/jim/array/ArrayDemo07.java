package com.jim.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] arrays = {3,5345,6324,6234,4125,31,51453,61};
        sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] a){
        int tmp;

        for (int j = 0; j < a.length-1; j++) {
            boolean flag = true; //优化程序，当后面已经是正确的顺序时，退出该循环
            for (int i = 0; i < a.length-1-j; i++) {
                if(a[i]>a[i+1]){
                    tmp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=tmp;
                    flag=false;
                }
            }
            if(flag) break;
        }

    }
}
