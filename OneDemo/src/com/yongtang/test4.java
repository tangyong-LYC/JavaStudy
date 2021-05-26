package com.yongtang;

public class test4 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[]={
                "Hello world",
                "No,I mean it!",
                "HELLO WORLD!!"
        };
        //异常：ArrayIndexOutOfBoundsException：数组下标越界
        while (i<4){
            try{
                System.out.println(greetings[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Resetting Index Value");
                i=5;
            }catch (Exception e){
                System.out.println(e.toString());
            }finally {
                System.out.println("This is always printed");
            }
            i++;
        }
    }
}
