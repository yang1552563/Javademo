package basicgrammerpractice.dayin;

public class ZhengFangXing {
    public static void main(String[] args) {
        /*for (int j = 13;j>0;j-- ){
            System.out.println("*"+"");
            for (int p = j;p>0;p--){
                System.out.println("*"+"");
            }
            System.out.println();
        }*/
        //外层循环 每次输出一行*
 for (int i = 1; i <= 5; i++) {
// System.out.print("*");
 //内层循环 每次输出一个*
 for (int j = 1; j <= 5; j++) {
     for (int p = 1; p <= 5; p++){
         System.out.print("$");
     }
 System.out.print("*");
 }
 System.out.println();
        }


    }
}
