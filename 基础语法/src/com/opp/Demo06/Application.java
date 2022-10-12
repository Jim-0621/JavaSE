package com.opp.Demo06;

public class Application {
    public static void main(String[] args) {
        //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();   //A

        //父类的引用指向了子类
        B b = new A();  //子类重写了父类的方法
        b.test();   //B
    }
}
