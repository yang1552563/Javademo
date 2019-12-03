package objectpractice.shitou;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        //创建对象
        User [] yh = new User[5] ;

        for (int i= 0 ;i>=0 ;i++) {
            //键盘录入
            User user = new User();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.next();
            System.out.println("请输入密码");
            user.setname(name);
            int password = sc.nextInt();
            user.setpassword(password);
            //调用方法
            String a = user.panduan(yh, name, password, user);
            System.out.println(a);
        }
    }
}
