package com.yongtang.baseStudy;

/**
 * @author yongtang
 */
public class Constant {
    //==================================================================================================================
    //常量（com.yongtang.baseStudy.Constant）:初始化后不能再改变值！不会变动的值。
    //所谓常量可以理解为一种特殊的变量，它的值被设定后，在程序运行中不允许被改变。
    //final   常量名 = 值；    常量名一般使用大写字符
    //final是修饰符，不存在先后顺序
    //==================================================================================================================
    static final double PI = 3.14;
    public static void main(String[] args) {
        System.out.println(PI);
    }
}
