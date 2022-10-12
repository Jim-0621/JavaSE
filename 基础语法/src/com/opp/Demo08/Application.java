package com.opp.Demo08;

public class Application {
    public static void main(String[] args) {
        //类型之间的转换：基本类型转换 父 子
        //高                    低
        Person student1 = new Student();
        //student 将这个独显转换为Student类型，我们就可以使用student类型的方法了！
        //两种方法都可以
        Student student2 = (Student) student1;
        student2.go();
        ((Student) student1).go();


        Student student3 = new Student();
        student3.go();
        Person person3 = student3;
        //person3.go(); person3丢失go方法

        System.out.println("==========");

        //object->string
        //object->person->student
        //object->person->teacher
        Object object = new Student();
        //true
        System.out.println(object instanceof Student);
        System.out.println(object instanceof Person);
        System.out.println(object instanceof Object);
        //false
        System.out.println(object instanceof Teacher);
        System.out.println(object instanceof String);

        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);
        System.out.println(person instanceof Teacher);  //false
        //System.out.println(person instanceof String); 编辑报错

        Student student = new Student();
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Object);
        //System.out.println(student instanceof Teacher);   编译报错！
        //System.out.println(student instanceof String);    编译报错！

    }
}
