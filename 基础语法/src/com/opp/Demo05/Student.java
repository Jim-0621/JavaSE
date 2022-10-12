package com.opp.Demo05;
//student 是 人
//子类继承了父类，就会拥有父亲的全部方法！
public class Student extends Person{
    //ctrl + H 快捷键：继承树
    private String name = "Jim1";

    public void test(String name){
        System.out.println(name);   //Sting name
        System.out.println(this.name);  //private String name
        System.out.println(super.name); //父类的protected String name
    }


    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();    //print()
        this.print();   //print()
        super.print();  //person 下面的print()
    }

    public Student(){
        //隐藏构造:调用了分类的无参构造
        //super(); 隐藏了这一行代码，如果显示写出来，必须放在子类构造器的第一行
        System.out.println("Student无参构造执行了");
    }
}
