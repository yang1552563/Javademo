package com.itdr;
import java.util.Scanner;
public class java8 {
    public static void main(String[]args){
        //用户输入两个数字，求两个数字的和
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int x=sc.nextInt();
        System.out.println("请输入第二个数字");
        int y=sc.nextInt();
        int z=x+y;
        System.out.println("两个数相加"+z);
        int d=x-y;
        System.out.println("两个数相减"+d);
        int f=x*y;
        System.out.println("两个数相乘"+f);
        int g=x%y;
        System.out.println("两个数相除"+z);
    }
}
