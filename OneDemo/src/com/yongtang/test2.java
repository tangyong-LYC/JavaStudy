package com.yongtang;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int judge = 1;
        while(judge != 0){
            System.out.println("请输入第一位数:");
            Scanner num1 = new Scanner(System.in);
            //判断第一位输入数字类型
            if (num1.hasNextInt()){
                int a = num1.nextInt();
                System.out.println("请输入第二位数:");
//                Scanner num2 = new Scanner(System.in);
                //判断第二位数字的类型int
                if (num1.hasNextInt()){
                    int b = num1.nextInt();
                    System.out.println("请输入你想进行的运算：");
//                    Scanner operator = new Scanner(System.in);
                    //判断加减乘除运算
                    if (num1.hasNext()){
                        String c = num1.next();
                        switch (c){
                            case "+":
                                System.out.println("计算结果是:"+a+"+"+b+"="+(a+b));
                                break;
                            case "-":
                                System.out.println("计算结果是:"+a+"-"+b+"="+(a-b));
                                break;
                            case "*":
                                System.out.println("计算结果是:"+a+"×"+b+"="+(a*b));
                                break;
                            case "/":
                                //处理分母不能为零
                                if(b>0 || b<0){
                                    System.out.println("计算结果是:"+a+"÷"+b+"="+(a/(double)b));
                                }else{
                                    System.out.println("分母不能为零");
                                }
                                break;
                            default:
                                System.out.println("运算符输入错误");
                                break;
                        }
                    }else {
                        System.out.println("运算符输入错误");
                    }
                    //判断第二个数字类型是double
                }else if (num1.hasNextDouble()){
                    double b = num1.nextDouble();
                    System.out.println("请输入你想进行的运算：");
//                    Scanner operator = new Scanner(System.in);
                    //判断加减乘除运算
                    if (num1.hasNext()){
                        String c = num1.next();
                        switch (c){
                            case "+":
                                System.out.println("计算结果是:"+a+"+"+b+"="+(a+b));
                                break;
                            case "-":
                                System.out.println("计算结果是:"+a+"-"+b+"="+(a-b));
                                break;
                            case "*":
                                System.out.println("计算结果是:"+a+"×"+b+"="+(a*b));
                                break;
                            case "/":
                                //处理分母不能为零
                                if(b>0 || b<0){
                                    System.out.println("计算结果是:"+a+"÷"+b+"="+(a/b));
                                }else{
                                    System.out.println("分母不能为零");
                                }
                                break;
                            default:
                                System.out.println("运算符输入错误");
                                break;
                        }
                    }else {
                        System.out.println("运算符输入错误");
                    }
                }else {
                    System.out.println("输入数字格式不是int型或double型");
                }
                //判断第一个数字是double型
            }else if(num1.hasNextDouble()){
                double a = num1.nextDouble();
                System.out.println("请输入第二位数:");
//                Scanner num2 = new Scanner(System.in);
                //判断第二位数字的类型int
                if (num1.hasNextInt()){
                    int b = num1.nextInt();
                    System.out.println("请输入你想进行的运算：");
//                    Scanner operator = new Scanner(System.in);
                    //判断加减乘除运算
                    if (num1.hasNext()){
                        String c = num1.next();
                        switch (c){
                            case "+":
                                System.out.println("计算结果是:"+a+"+"+b+"="+(a+b));
                                break;
                            case "-":
                                System.out.println("计算结果是:"+a+"-"+b+"="+(a-b));
                                break;
                            case "*":
                                System.out.println("计算结果是:"+a+"×"+b+"="+(a*b));
                                break;
                            case "/":
                                //处理分母不能为零
                                if(b>0 || b<0){
                                    System.out.println("计算结果是:"+a+"÷"+b+"="+(a/b));
                                }else{
                                    System.out.println("分母不能为零");
                                }
                                break;
                            default:
                                System.out.println("运算符输入错误");
                                break;
                        }
                    }else {
                        System.out.println("运算符输入错误");
                    }
                    //判断第二个数字类型是double
                }else if (num1.hasNextDouble()){
                    double b = num1.nextDouble();
                    System.out.println("请输入你想进行的运算：");
//                    Scanner operator = new Scanner(System.in);
                    //判断加减乘除运算
                    if (num1.hasNext()){
                        String c = num1.next();
                        switch (c){
                            case "+":
                                System.out.println("计算结果是:"+a+"+"+b+"="+(a+b));
                                break;
                            case "-":
                                System.out.println("计算结果是:"+a+"-"+b+"="+(a-b));
                                break;
                            case "*":
                                System.out.println("计算结果是:"+a+"×"+b+"="+(a*b));
                                break;
                            case "/":
                                //处理分母不能为零
                                if(b>0 || b<0){
                                    System.out.println("计算结果是:"+a+"÷"+b+"="+(a/b));
                                }else{
                                    System.out.println("分母不能为零");
                                }
                                break;
                            default:
                                System.out.println("运算符输入错误");
                                break;
                        }
                    }else {
                        System.out.println("运算符输入错误");
                    }
                }else {
                    System.out.println("输入数字格式不是int型或double型");
                }
            }else {
                System.out.println("输入数字格式不是int型或double型");
            }
            //判断是否还要继续计算
            System.out.println("您是否还需要进行计算：结束请按'0',继续请按其他键");
//            Scanner out = new Scanner(System.in);
            if (num1.hasNextInt()){
                judge = num1.nextInt();
            }else {
                judge = 1;
            }
        }
        System.out.println("您已结束本次运算");
    }
}
