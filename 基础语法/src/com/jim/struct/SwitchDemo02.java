package com.jim.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "Jim";
        //JDK7的新特性，表达式结果可以是字符串
        //字符的本质还是数字
        //反编译 java-class(字节码文件)-反编译(IDEA)
        switch (name){
            case "Jim":
                System.out.println("Jim");
                break;
            case "Rose":
                System.out.println("Rose");
                break;
            default:
                System.out.println("弄啥嘞");
        }
    }
}
