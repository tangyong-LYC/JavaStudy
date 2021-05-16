package com.yongtang.baseStudy;

/**
 * @author yongtang
 */
public class Identifier {
    public static void main(String[] args) {
        /*
        1、所有标识符都应该以字母（A-Z）&（a-z）,美元符（$），或者下划线（_）开始   大小写敏感
        2、首字母之后可以是字母（A-Z）&（a-z）,美元符（$），或者下划线（_）或数字的任何字符组合
        3、不能使用关键字作为变量名或方法名
        4、标识符是大小写敏感的
        5、合法标识符举例：age、$name、_auther
        6、非法标识符举例：123abc,-asd,#qwe
        7、可以使用中文命名，但是一般不建议这样去使用，也不建议使用拼音，很low

        Java 是强类型语言
        要求变量的使用要严格符合规定，所有变量都必须先定义后才能使用
         */
        String Ahello = "yongtang";
        String ahello = "yongtang";
        String $hello = "yongtang";
        String _hello = "yongtang";
//        String @hello = "yongtang";
    }
}