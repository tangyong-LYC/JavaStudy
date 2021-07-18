package com.yongtang.methods;
//命令行传参
/**
 * @author yongtang
 */
public class Demo3 {
    public static void main(String[] args) {
        for(int i = 0;i<args.length;i++){
            System.out.println("args["+i+"]:"+args[i]);
        }
    }
}
