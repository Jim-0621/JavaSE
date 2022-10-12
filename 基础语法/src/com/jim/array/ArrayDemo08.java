package com.jim.array;

import java.util.Arrays;

public class ArrayDemo08 {
    public static void main(String[] args) {
        int[][] arrays = new int[5][5];
        arrays[1][2]=1;
        arrays[2][3]=1;
        //For-each
        //arrays.for+enter
        System.out.println("原二维数组：");
        for (int[] array : arrays) {
            //array.for+enter
            for (int i : array) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }

        System.out.println("============");

        int[][] sparseArray = sparseArrayStore(arrays);
        //无法获取具体下标
        for (int[] ints : sparseArray) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }

        System.out.println("============");
        System.out.println("稀疏数组还原：");
        int[][] sparseArrayRestore = sparseArrayRestore(sparseArray);
        //无法获取具体下标
        for (int[] ints : sparseArrayRestore) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }

    //传入数组a，返回对应的稀疏数组
    public static int[][] sparseArrayStore(int[][] a){
        int sum = 0;    //数组有多少个数不为1
        for (int[] ints : a) {
            for (int anInt : ints) {
                if(anInt!=0) sum+=1;
            }
        }
        System.out.println("数组中有"+sum+"个数不为0，稀疏数组存储如下：");

        int[][] sparseArray=new int[sum+1][3];
        //第一行说明数组几行几列，有几个不为0的数
        sparseArray[0][0]=a.length;
        sparseArray[0][1]=a[0].length;  //这里需要的前提是数组中每行元素相等
        sparseArray[0][2]=sum;

        int count=0;
        //可以获取具体下标
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if(a[i][j]!=0){
                    count++;
                    sparseArray[count][0]= i;
                    sparseArray[count][1]= j;
                    sparseArray[count][2]= a[i][j];

                }
            }
        }
        return sparseArray;

    }

    public static int[][] sparseArrayRestore(int[][] sa){
        int[][] sparseArrayRestore = new int[sa[0][0]][sa[0][1]];
        for (int i = 0; i < sa[0][2] ; i++) {
            sparseArrayRestore[sa[i+1][0]][sa[i+1][1]]=sa[i+1][2];
        }
        return sparseArrayRestore;
    }
}
