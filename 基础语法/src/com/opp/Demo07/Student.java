package com.opp.Demo07;

public class Student extends Person{
    //alt+insert override
    @Override
    public void run() {
        //super.run();
        System.out.println("son");
    }

    public void eat(){
        System.out.println("eat");
    }
}
