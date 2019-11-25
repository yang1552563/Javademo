package basicgrammerpractice.dayin;

public class Break {
    public static void main(String[] args) {
        //break语句只能运用于循环嵌套，无标号break跳出就近循环，有标号break跳出标号所指的循环
        //return只能运用于方法中，用来返回一个值
        //continue让循环强制跳出此次循环，进入下次循环，无标号continue跳出就近循环，有标号continue跳出标号所指的循环,这里指的是嵌套
        for (int i = 0;i<13;i++){
            for (int j = 0;j<i;j++){
                if ( j==6 ){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }

         out:for (int i = 0;i<13;i++){
            for (int j = 0;j<i;j++){
                if ( j==6 ){
                    break out;
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
