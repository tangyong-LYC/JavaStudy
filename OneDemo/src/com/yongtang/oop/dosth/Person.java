package com.yongtang.oop.dosth;

public class Person {
    //显性的定义构造器
    //构造器：和类名相同，没有返回值
    String name;
    //实例化初始值
    //1、使用new关键字，必须要有构造器
    //2、用来初始化值
    public Person(){
        this.name = "ty";
    }

    //有参构造：一旦定义了有参够造，无参就必须显性的定义
    public Person(String name){
        this.name = name;
    }
}
