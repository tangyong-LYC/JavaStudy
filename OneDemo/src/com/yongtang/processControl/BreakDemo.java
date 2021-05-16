package com.yongtang.processControl;
//======================================================================================================================
//break在任何循环语句的主体部分，均可用break控制循环的流程。break用于强行退出循环，不执行循环中剩余的语句。（break语句也在switch语句中使用）
//======================================================================================================================
/**
 * @author yongtang
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i<100){
            i++;
            if (i==30){
                break;
            }
        }
        System.out.println(i);
    }
}
