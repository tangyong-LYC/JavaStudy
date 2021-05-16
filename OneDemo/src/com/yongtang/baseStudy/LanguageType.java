package com.yongtang.baseStudy;

/**
 * @author yongtang
 */
public class LanguageType {
    public static void main(String[] args) {
        /*
        Java 是强类型语言
        要求变量的使用要严格符合规定，所有变量都必须先定义后才能使用

        变量是什么：变量就是可以变化的量
        Java是一种强类型语言，每个变量都必须声明其类型
        Java变量是程序中最基本的存储单元，其要素包括变量名，变量类型和作用域

        type varName [=value] [{,varName[=value]}];
        数据类型  变量名  = 值；可以使用逗号隔开来声明多个同类型变量。

        注意事项：
        1、每个变量都有类型，类型可以是基本类型，也可以是引用类型。
        2、变量名必须是合法的标识符。
        3、变量声明是一条完整的语句，因此，每一个声明都必须以分号结束。
         */
        //String a = ;
        String a = "hello";
        System.out.println(a);
        int num = 10;
        System.out.println(num);
        /*
        Java 数据类型
        一、基本类型(primitive type)
           数值类型：整数类型(byte/short/int/long)、浮点类型(float/double)、字符类型(char)
           （boolean）布尔类型：ture/false
        二、引用类型(reference type)
            类、接口、数组
         */
        //八大基本数据类型
        //整数 Long类型要在数字后面加个L
        int num1 =10;
        byte num2 =20;
        short num3 =30;
        long num4 = 30L;

        //浮点数 float类型要在数字后面加个f||F
        float num5 = 50.12F;
        double num6 =3.1415926;

        //字符
        char name = '过';

        //布尔值：是非 true or false
        boolean flag = true;
    }
}
