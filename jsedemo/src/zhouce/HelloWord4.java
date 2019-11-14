package zhouce;

public class HelloWord4 {
    public static void main(String[]args){
        int ages1=24;
        int ages2=18;
        int ages3=36;
        int ages4=27;
        int sum=ages1+ages2+ages3+ages4;
        double avg=sum/4;
        int minus=ages1-ages2;
        int newAge=--ages1;
        System.out.println("年龄总和："+sum);
        System.out.println("平均年龄"+avg);
        System.out.println("年龄差值"+minus);
        System.out.println("自减后的年龄"+newAge);
    }
}
