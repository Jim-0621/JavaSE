package com.jim.operator;
//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        //x?y:z
        //x==true,则结果为y
        //x==false,则结果为z
        int score=80;
        String type = score<60?"不及格":"及格";
        //if
        System.out.println(type);


        //运算符的优先级可以不用记住，平时多用（），改变优先级
    }
}
