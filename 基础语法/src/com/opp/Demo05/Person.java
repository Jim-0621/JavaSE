package com.opp.Demo05;
/*
继承
在Java中所有的类都默认直接或者间接继承object
一个儿子只能有一个爸爸，一个爸爸可以有多个儿子（只有单继承，没有多继承）

 */



//person 人
public class Person {
    //public
    //private 私有则子类无法继承
    //default 不写则默认
    //protected
    public int money = 10_0000_0000;

    public void say(){
        System.out.println("说点什么好呢？");
    }

    protected  String name = "Jim2";
    //private 则无法被之类super调用
    public void print(){
        System.out.println("Person");
    }

    public Person(){
        System.out.println("Person无参执行了");
    }

}
