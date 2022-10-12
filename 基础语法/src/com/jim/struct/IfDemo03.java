package com.jim.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score==100){
            System.out.println("满分");
        }else if(score>80){
            System.out.println("优秀");
        }else if(score>60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        scanner.close();
    }
}
