package com.jim.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");

        String str = scanner.nextLine();
        System.out.println("输入的内容为："+str);

        scanner.close();
    }

}
