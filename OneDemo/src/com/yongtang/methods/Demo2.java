package com.yongtang.methods;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(max(34,24));
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
}
