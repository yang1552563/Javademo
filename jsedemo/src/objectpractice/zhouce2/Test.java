package objectpractice.zhouce2;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Users[] arr = new Users[10];
        Scanner sc = new Scanner(System.in);

        //用户数据
        System.out.println("请输入您的性名、门派、性别、年龄");
        String name = sc.next();
        String menpai = sc.next();
        String sex = sc.next();
        int ages = sc.nextInt();
        int j = users(name, menpai, sex, ages, arr);
        if (j == 1) {
            System.out.println("记录成功");
        } else {
            System.out.println("记录失败");
        }
        System.out.println("请输入你的年龄");
        int age = sc.nextInt();
        int m = jinru(age);
        if (m == 1) {
            System.out.println("进入灵境成功");
        } else {
            System.out.println("进入灵境失败");
        }
        System.out.println("你有以下门派可以选择");
        System.out.println("武当派、功夫派、山门派");
        String menpail = sc.next();
        System.out.println("输入门派成功，请继续输入认数");
        int renshu = sc.nextInt();
        int l = menpaijinru(renshu);
        if (l == 1) {
            System.out.println("进入灵境成功");
        } else {
            System.out.println("进入灵境失败");
        }
        System.out.println("请输入你喜欢的灵兽类型");
    }

    public static int users(String name, String menpai, String sex, int ages, Users[] arr) {
        //创建一个用户对象
        Users n = new Users();
        //给一个用户对象赋值
        n.name = name;
        n.menpai = menpai;
        n.ages = ages;
        n.sex = sex;
        //保存对象（在数组中的空的位置上保存）
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = n;
                return 1;
            }
        }
        return -1;
    }

    //用户登录
    public static int jinru(int age) {
        if (age > 10 && age < 30) {
            return 1;
        }
        return -1;
    }

    public static int menpaijinru(int renshu) {
      if (renshu>0 && renshu<10){
          return 1;
      }
        return -1;
    }
}

