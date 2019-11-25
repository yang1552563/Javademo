package basicgrammerpractice;

public class OperationalOharacter {
    public static void main(String[]args){
        //运算符，a++为先执行程序后加一，++a为先加一后执行程序
        int a=2,b=3;
        System.out.println(a/b);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println((a++)+(b++));
        System.out.println((a++)+(b--));
        System.out.println((a++)+(++b));
        System.out.println((a++)+(--b));
        //关系运算符:==,!=,<,>,>=,<=
        char C='F',B='G',D='H';
        int d=100,e=101;
        System.out.println(C==B);
        System.out.println(B==D);
        System.out.println(C==D);
        System.out.println(d!=e);
        System.out.println(d<e);
        //逻辑运算符：&&，||，^，|，&，！
        int a1=10,a2=12,a3=111;
        System.out.println(a1>a2||a2<a3);//一真则真
        System.out.println(a1>a2&&a2<a3);//一假为假
        System.out.println(a1>a2^a2<a3);//同真为假，同假为假，一假为真
        System.out.println(a1>a2^a2>a3);//

    }
}
