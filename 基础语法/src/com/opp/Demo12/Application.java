package com.opp.Demo12;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();

    }
}
