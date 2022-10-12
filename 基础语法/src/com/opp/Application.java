package com.opp;

import com.opp.Demo04.Student;
import com.opp.Demo03.Pet;

public class Application {
    public static void main(String[] args) {
        //new Pet()然后alt+enter
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);

        System.out.println("============");
        /*
        printLn里面有很多方法重载
        ctrl+点击 可以进去看方法
         */



        Student s1 = new Student();
        //s1.name;
        s1.setName("Jim");
        System.out.println(s1.getName());
        s1.setAge(999); //不合法
        System.out.println(s1.getAge());
    }
}

/*
1.类与对象
    类是一个模板：抽象，对象是一个具体的实例
2.方法
    定义、调用！
3.对应的引用
    引用类型：基本类型（8）
    对象是通过引用来操作的：栈->堆
4.属性：字段Field 成员变量
    默认初始化：
    数字： 0 0.0
    char:u0000
    boolean:false
    引用：null

    修饰符 属性类型 属性名 = 属性值！
5.对象的创建和使用
    - 必须使用new关键字创造对象，构造器 new Person();
    - 对象的属性 kuangshen.name
    - 对象的方法 kuangshen.sleep

6.类：
    静态的属性   属性
    动态的行为   方法

    封装、继承、多态
 */