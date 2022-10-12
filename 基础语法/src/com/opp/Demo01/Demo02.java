package com.opp.Demo01;

public class Demo02 {
    public static void main(String[] args) {
        Student student = new Student();
        student.sayHello();
    }

    //和类一起加载的
    public static void a(){
        //b();  b()方法加上static才可以调用
    };
    //类实例化之后才会存在
    public void b(){

    };
}
