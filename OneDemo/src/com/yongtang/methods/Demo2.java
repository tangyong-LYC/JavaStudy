package com.yongtang.methods;
/**
 * @author yongtang
 */
//======================================================================================================================
//方法的重载
//重载就是在一个类中，有相同的函数名称，但形参不同的函数
//规则
//  1、方法名称必须相同
//  2、参数列表必须不同（个数不同，或类型不同、参数排列的顺序不同）
//  3、方法返回的类型可以相同也可以不相同。
//  4、仅仅返回的类型不同不足以称为方法的重载
//实现理论：
//  方法名称相同时。编译器会根据调用方法的参数个数、参数类型等逐个去匹配，以选择对应的方法，如果匹配失败，则编译器报错
//======================================================================================================================
public class Demo2 {
    public static void main(String[] args) {
        System.out.println(max(34.0,24));
    }
    public static int max(int num1,int num2){
        int result = 0;
        if (num1>num2){
            result=num1;
        }else if (num1<num2){
            result=num2;
        }else {
            System.out.println("num1=num2");
            return 0;
        }
        return result;
    }
    public static double max(double num1,double num2){
        double result = 0;
        if (num1>num2){
            result=num1;
        }else if (num1<num2){
            result=num2;
        }else {
            System.out.println("num1=num2");
            return 0;
        }
        return result;
    }
}
