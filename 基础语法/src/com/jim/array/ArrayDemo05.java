package com.jim.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //二维数组
        int[][] arrays = {{1,2},{2,3},{3,4},{4,5}};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
