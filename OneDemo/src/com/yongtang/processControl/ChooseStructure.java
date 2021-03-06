package com.yongtang.processControl;

//======================================================================================================================
//   选择结构
//      1、if单选择结构
//      2、if双选择结构
//      3、if多选择结构
//      4、嵌套的if结构
//      5、switch多选择结构
//======================================================================================================================

import java.util.Scanner;

/**
 * @author yongtang
 */
public class ChooseStructure {
    public static void main(String[] args) {
        //==============================================================================================================
        //    if单选择结构
        //    我们很多时候需要去判断一个东西是否可行，然后我们才去执行，这样一个过程在程序中用if语句来表示
        //    语法：
        //    if (布尔表达式){
        //         如果布尔表达式为true将执行的语句
        //     }
        //==============================================================================================================
        Scanner scanner = new Scanner(System.in);
        System.out.println("if单选择结构\n"+"请输入内容：");
        String s = scanner.nextLine();
        //equals:判断字符串是否相等
        if (s.equals("hello")){
            System.out.println("hello");
        }
        System.out.println("end");
//        scanner.close();
        //==============================================================================================================
        //     if双选择结构
        //     语法：
        //     if (布尔表达式){
        //          如果布尔表达式为true将执行的语句
        //      }else{
        //          如果布尔表达式为false将执行的语句
        //      }
        //==============================================================================================================
//        Scanner scanner1 = new Scanner(System.in);
        System.out.println("if双选择结构\n"+"请输入整数成绩：");
        int score = scanner.nextInt();
        if (score>60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        //==============================================================================================================
        //      if多选择结构
        //      语法：
        //      if (布尔表达式1){
        //           如果布尔表达式1为true将执行的语句
        //       }else if(布尔表达式2){
        //           如果布尔表达式2为true将执行的语句
        //       }else if(布尔表达式3){
        //           如果布尔表达式3为true将执行的语句
        //       }else{
        //           如果以上都不满足执行的代码
        //       }
        //==============================================================================================================
        System.out.println("if多选择结构\n"+"请输入小数：");
        float num = scanner.nextFloat();
        if (num>=60.0&&num<=70.0){
            System.out.println("及格");
        }else if(num>=70.0&&num<=100.0){
            System.out.println("优秀");
        }else if(num<=60.0&&num>=0.0){
            System.out.println("不及格");
        }else{
            System.out.println("输入不合法");
        }
        //==============================================================================================================
        //       嵌套的if结构
        //       使用嵌套的if...else语句是合法的。也就是说你可以在另一个if或else if语句中使用if或者else if语句。你可以像if语句一样嵌套else if...else.
        //       语法：
        //       if (布尔表达式1){
        //            如果布尔表达式1为true将执行的语句
        //          if(布尔表达式2){
        //            如果布尔表达式2为true将执行的语句
        //          }
        //       }
        //==============================================================================================================
        System.out.println("嵌套的if结构\n"+"输入整数：");
        int a = scanner.nextInt();
        if (a<=50){
            if (a<=25){
                System.out.println("小于25");
            }else{
                System.out.println("大于25");
            }
        }else{
            System.out.println("大于50");
        }
        scanner.close();
    }
}