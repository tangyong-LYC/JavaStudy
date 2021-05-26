package com.yongtang;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class test3 {
    //==================================================================================================================
    //计算身体质量指数（BMI）
    //==================================================================================================================
    public static void main(String[] args) {
        String name;
        int age;
        double weight;
        double hight;
        double bmi;
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名:");
        name = scanner.nextLine();
        System.out.println("请输入您的年龄:");
        age = scanner.nextInt();
        System.out.println("请输入您的体重:");
        weight = scanner.nextDouble();
        System.out.println("请输入您的身高:");
        hight = scanner.nextDouble();
        bmi = weight/(hight*hight);
//======================================================================================================================
//NumberFormat类的使用方法
//======================================================================================================================
        String a = NumberFormat.getInstance().format(bmi);
        System.out.println("默认格式输出:\n"+age+"岁"+name+"的BMI是:"+ a);

        a=NumberFormat.getCurrencyInstance().format(bmi);
        System.out.println("通用格式输出:\n"+age+"岁"+name+"的BMI是:"+ a);

        a=NumberFormat.getNumberInstance().format(bmi);
        System.out.println("通用数值格式输出:\n"+age+"岁"+name+"的BMI是:"+ a);

        a=NumberFormat.getPercentInstance().format(bmi);
        System.out.println("百分比格式输出:\n"+age+"岁"+name+"的BMI是:"+ a);

        NumberFormat format = NumberFormat.getInstance();
        System.out.println("请输入数值:");
        num = scanner.nextDouble();
        format.setMaximumFractionDigits(3);
        System.out.println("小数部分允许最大位数\n"+format.format(num));
        format.setMaximumIntegerDigits(3);
        System.out.println("整数部分允许最大位数\n"+format.format(num));
        format.setMinimumFractionDigits(4);
        System.out.println("小数部分允许最小位数\n"+format.format(num));
        format.setMinimumIntegerDigits(4);
        System.out.println("整数部分允许最小位数\n"+format.format(num));
//======================================================================================================================
//DecimalFormat类的使用方法
//======================================================================================================================
        DecimalFormat format1 = new DecimalFormat("0.###");
        System.out.println("BMI:"+format1.format(bmi));
        format1=new DecimalFormat("0.##");
        System.out.println("BMI:"+format1.format(bmi));
    }
}