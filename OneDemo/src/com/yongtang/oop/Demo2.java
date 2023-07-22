package com.yongtang.oop;

public class Demo2 {
    public static void main(String[] args) {
        //调用静态方法
        Student.doSomething();
        //实例化这个类 new
        //对象类型 对象名 = 对象值
        //调用非静态方法
        Student student = new Student();
        student.say();

    }
    //和类一起加载的
    public static void a(){

    }
    //类实例化后才存在
    public void b(){

    }
}
