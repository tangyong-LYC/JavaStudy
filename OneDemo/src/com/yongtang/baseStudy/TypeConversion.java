package com.yongtang.baseStudy;

/**
 * @author yongtang
 */
public class TypeConversion {
    public static void main(String[] args) {
        //==============================================================================================================
        //内存溢出
        //强制转换    （类型）变量名     高-->低
        //自动转换                    低-->高
        //注意点：1.不能对布尔值进行转换；2.不能把对象类型转换为不相干的类型；3.在把高容量转换到低容量的时候，强制转换；
        //      4.转换的时候可能存在内存溢出，或者精度问题
        //==============================================================================================================
        int i =128;
        byte b =(byte) i;
        System.out.println(i);
        System.out.println(b);
        System.out.println((int)23.7);
        System.out.println((int)-40.7f);
        char c = 'a';
        int d = c + 1;
        System.out.println(d);
        System.out.println((char)d);
        //==============================================================================================================
        //操作比较大的数的时候，注意内存溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        //total计算的时候溢出了
        //total2在转换之前已经出现问题了
        //==============================================================================================================
        int money = 10_0000_0000;
        int year = 20;
        int total = money*year;
        long total2 = money*year;
        long total3 = money*(long)year;
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}
