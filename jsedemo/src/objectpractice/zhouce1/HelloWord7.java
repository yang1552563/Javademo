package objectpractice.zhouce1;
import java.util.Scanner;
public class HelloWord7 {
    public static void main(String[]args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
if (a>-10&&a<10){
System.out.println("它是个1位小数");
}
else if (a>-100&&a<100){
    System.out.println("它是个2位小数");
}else if (a>-1000&&a<1000){
    System.out.println("它是个3位小数");
}else if (a>-10000&&a<10000){
    System.out.println("它是个4位小数");
}else if (a>-100000&&a<100000){
    System.out.println("它是个5位小数");
}else if (a>-1000000&&a<1000000){
    System.out.println("它是个6位小数");
}else if (a>-10000000&&a<10000000){
    System.out.println("它是个7位小数");
}else if (a>-100000000&&a<100000000){
    System.out.println("它是个8位小数");
}else if (a>-1000000000&&a<1000000000){
    System.out.println("它是个9位小数");
}else {
    System.out.println("无效");
}
    }
}
