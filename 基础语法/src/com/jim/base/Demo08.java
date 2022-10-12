package com.jim.base;

public class Demo08 {
    //类变量 static 现在都用这个
    static double salary =2580;

    //属性：变量
    //实例变量：从属与对象；如果不自行初始化，这个类型的默认值0 0.0 u0000 false(布尔值默认是false)
    //除了基本类型，其余的默认值都是null
    //八大基本类型：byte, short, char, int, long, float, double, boolean

    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i =1;
        System.out.println(i);

        //变量类型  变量名字 = new com.jim.base.Demo08();
        Demo08 demo08=new Demo08();

        System.out.println(salary);
    }

    //其他方法
    public void add(){
        //System.out.println(i);
    }

}
