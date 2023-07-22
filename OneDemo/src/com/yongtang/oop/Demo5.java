package com.yongtang.oop;

//引用传递
public class Demo5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        Demo5.change(person);
        System.out.println(person.name);
    }

    public static void change(Person person) {
        person.name = "ty";
    }
}
class Person{
    String name;
}