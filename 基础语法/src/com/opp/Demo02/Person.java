package com.opp.Demo02;

//java
//out 目录对应person.class有一个Person方法
//一个类即使什么都不写，它也会存在一个方法

public class Person {
    //显示的定义构造器
    String name;

    //实例化初始值
    //1.使用new关键字必须要有构造器
    //2.用来初始化值
    public Person(){
        this.name = "Jim";
    }

    //有参构造:一旦定义了有参构造，无参就必须显示定义
    //删除上面方法，Application会报错
    public Person(String name){
        this.name = name;
    }

    //alt + insert 快捷键构造

}

/*
    构造器：
       1.和类名相同
       2.没有返回值
    作用：
        1.new本质在调用构造方法
        2.初始化对象的值
    注意点：
        1.定义有参构造之后，如果想使用无参构造，显示的定义一个无参的构造

    Alt+inert 快捷键
 */
