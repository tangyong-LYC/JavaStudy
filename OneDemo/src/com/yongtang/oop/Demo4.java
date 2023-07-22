package com.yongtang.oop;

public class Demo4 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        Demo4.change(a);
        System.out.println(a);
    }
    //返回值为空
    public static void change(int a){
        a = 10;
    }
}
