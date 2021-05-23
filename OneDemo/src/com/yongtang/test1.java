package com.yongtang;

public class test1 {
    public static void main(String[] args) {
        int b1 = 1;
        int b2 = 1;
        int c=1;

        b1<<=31;
        System.out.println(b1);
        b2<<=31;

        b1>>=31;
        System.out.println(b1);
        b1>>=1;
        System.out.println(b1);

        b2>>>=31;
        System.out.println("\nb2\n"+b2);
        b2>>>=31;
        System.out.println(b2);
        c >>=1;
        out:for(int i =0;i<20;i++){
            for(int j=0;j<20;j++){
                if(j>i){
                    System.out.println();
                    continue out;
            }
            System.out.print("*");
            }
        }
    }
}
