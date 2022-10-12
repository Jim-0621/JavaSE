package com.opp.Demo01;
//引用传递：对象，本质还是值传递

//只有一个public class, 但是可以有多个class
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        change(person);
        System.out.println(person.name);


    }
    public static void change(Person person){
        person.name="Jim";
    }

}

class Person{
    String name;
}