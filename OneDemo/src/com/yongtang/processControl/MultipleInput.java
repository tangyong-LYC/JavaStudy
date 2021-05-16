package com.yongtang.processControl;

import java.util.Scanner;

/**
 * @author yongtang
 */
public class MultipleInput {
    public static void main(String[] args) {
        //==============================================================================================================
        //我们可以通过输入多个数字，并求其总和和平均数，每输入一个数字用回车确认，通过输入数字来结束输入并输出执行结果：
        //==============================================================================================================
        Scanner scanner = new Scanner(System.in);
        //============================================
        //和
        //============================================
        double sum = 0;
        //============================================
        //计算输入多少个数字
        //============================================
        int m = 0;
        //============================================
        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        //============================================
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            //计算输入多少个数字
            m = m + 1;
            sum = sum + x;
            System.out.println("你输入了第"+m+"个数据，"+"和为"+sum);
        }
        System.out.println(m + "个数字的和为" + sum);
        System.out.println(m + "个数字的平均值为" + (sum/m));
        scanner.close();
    }
}
