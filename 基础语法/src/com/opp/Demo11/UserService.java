package com.opp.Demo11;


//图标不一样了
//interface 定义的关键字，接口都需要有实现类
//实现了接口的类，就需要重写接口中的方法
public interface UserService {
    //接口中的所有定义都是抽象的public
    //不用写public abstract，因为已经默认如此
    //public abstract void run();

    //常量 public static final 一般不定义常量
    int AGE = 99;

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
