package com.opp.Demo02;

//一个项目应该只存一个main方法
public class Application {
    public static void main(String[] args) {
        //类：抽象的、实例化
        //类实例化后会返回一个自己的对象！
        //xiaoming对象就是一个student类的具体实例！
        Student xiaoming = new Student();

        xiaoming.name = "小明";

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);   //默认为0

        //new 实例化了一个对象
        Person person = new Person("Rose");
        System.out.println(person.name);

    }



}
