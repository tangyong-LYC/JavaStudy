package com.yongtang.processControl;
//======================================================================================================================
// 多选择结构还有一个实现方式就是switch case语句。
// switch case语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。
// switch语句中的变量类型可以是：
//       1、byte、short、int或者char
//       2、从Java SE7开始，Switch支持字符串String类型，同时case标签必须为字符串或字面量。
//======================================================================================================================
// 语法
//        switch(expression){
//             case value :
//                语句
//                break;
//             case value :
//                语句
//                break;
//             default:
//                语句
//        }
//======================================================================================================================
/**
 * @author yongtang
 */
public class SwitchStructure {
    public static void main(String[] args) {
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("挂科");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
