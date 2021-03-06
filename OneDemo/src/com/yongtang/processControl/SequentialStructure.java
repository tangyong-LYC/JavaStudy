package com.yongtang.processControl;
//======================================================================================================================
//  1、Java的基本结构就是顺序结构，除非特别指明，否者就按顺序一句一句执行
//  2、顺序结构是最简单的算法结构
//                                        │
//                             ┍──────────│──────────┑
//                             │          ↓          │
//                             │    ┊┄┄┄┄┄┄┄┄┄┄┄┊    │
//                             │    ┊     A     ┊    │
//                             │    ┊┄┄┄┄┄┄┄┄┄┄┄┊    │
//                             │          │          │
//                             │          ↓          │
//                             │    ┊┄┄┄┄┄┄┄┄┄┄┄┊    │
//                             │    ┊     B     ┊    │
//                             │    ┊┄┄┄┄┄┄┄┄┄┄┄┊    │
//                             │          │          │
//                             │          │          │
//                             ┕──────────│──────────┙
//                                        ↓
//  3、语句与语句之间，框与框之间是按从上到下的顺序进行的，他是由若干个依次执行的处理步骤组成的，它是任何一个算法都离不开的一种基本算法结构
//======================================================================================================================
/**
 * @author yongtang
 */
public class SequentialStructure {
    public static void main(String[] args) {
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("hello4");
        System.out.println("hello5");
    }
}
