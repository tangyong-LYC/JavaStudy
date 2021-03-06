package com.yongtang.methods;
//======================================================================================================================
//JDK1.5开始，Java支持传递同类型的可变参数的一个方法。
//在方法声明中，在指定参数类型后面加一个省略号（...）。
//一个方法中只能声明一个可变参数，它必须是方法的最后一个参数。任何普通参数必须在它之前声明。
//======================================================================================================================
public class Demo4 {
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        demo4.test(2,3,56,7,834,4,24,73,57);
    }
    public void test(int... i){
        for (int x:i){
            System.out.println(x);
        }
    }
}
