package com.jim.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //静态初始化：创建+赋值
        int[] nums ={1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum +=nums[i];
        }
        System.out.println(sum);
    }
}
