package basicgrammerpractice.dayin;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 12 :
                System.out.println(12);
        }
        int b = sc.nextInt();
        switch(b){
            case 13 :
                System.out.println(13);
                break;
                case 14 :
                System.out.println(13);
                break;
                case 15 :
                System.out.println(13);
                break;
                case 16 :
                System.out.println(13);
                break;
            default:
                System.out.println(55);
        }
    }
}
