package com.opp.Demo12;

//一个java类中可以有多个class类，但是只能有一个public class
public class Outer {
    private  int id = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    public class Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }

        //获得外部类的私有属性、方法
        public void getID(){
            System.out.println(id);
        }
    }

    public void method(){
        class Inner{
            public void in(){

            }
        }
    }
}



class A{

}