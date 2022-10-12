package com.jim.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        //静态初始化：创建+赋值
        int[] nums ={1,2,3,4,5};
        int sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
            sum +=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        System.out.println();
        System.out.println("当前数组中所有数字之和为"+sum);
        System.out.println("当前数组中最大数为"+max);
    }
}
