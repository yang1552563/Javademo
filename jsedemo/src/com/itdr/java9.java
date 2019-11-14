package com.itdr;

public class java9 {
    public static  void  main(String[]args){
        int a=1;
        int b=2;
        System.out.println(a++);
        System.out.println(--b);
        System.out.println(a++ & b++);
        System.out.println(a++ >0 | b++ <0);
        System.out.println(a++ >b && b--<a);
        System.out.println(a-- >1 || b++<0);
        System.out.println(--b >a ^b <a);
        System.out.println((--b+a <0));


    }
}
