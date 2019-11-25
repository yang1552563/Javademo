package objectpractice.zhouce1;

public class HelloWord13 {
    public static void main(String[]args){
        int a=6;
        if (a>60){
            System.out.println("老年");
        }
        else if (a>40&&a<60){
            System.out.println("中年");
        }
        else if (a>18&&a<40){
            System.out.println("少年");
        }
        else if (a<18){
            System.out.println("童年");
        }
        else{
            System.out.println("无效");
        }

    }

}
