package com.yongtang.baseStudy;
//======================================================================================================================
//作用域：1、类变量；2、实例变量；3、局部变量
//======================================================================================================================
/**
 * @author yongtang
 */
public class VariableScope {
    //==================================================================================================================
    //属性：变量
    //实例变量:从属于对象；如果不自行初始化，这个类型的默认值  0、0.0    布尔值：默认false  除了基本类型，其余的默认值都是null
    //==================================================================================================================
    String name;
    int age;
    //==================================================================================================================
    //类变量  static
    //==================================================================================================================
    static double salary = 2500;
    /**
     * main方法
     */
    public static void main(String[] args) {
        //==============================================================================================================
        //局部变量；必须声明和初始化值
        //==============================================================================================================
        int i = 10;
        System.out.println(i);
        //==============================================================================================================
        //变量类型  变量名字 = new com.yongtang.baseStudy.VariableScope()
        //==============================================================================================================
        VariableScope VariableScope = new VariableScope();
        System.out.println(VariableScope.age);
        System.out.println(VariableScope.name);
        //==============================================================================================================
        //类变量输出
        //==============================================================================================================
        System.out.println(salary);
    }

    /**
     * 其他方法
     */
    public void add(){
    }
}
