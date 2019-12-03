package objectpractice.lianxi;

public class Teacher {
    public int num = 10;
    public static int num2 = 20;
    public void show (){
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(num2);
    }
   /* public static void method(){
        System.out.println(num);//静态方法中不能加载非静态资源
        System.out.println(num2);
        function ()://静态方法中不能加载非静态资源
        function2();
    }*/
    public void fuction(){}
    public static void function2(){}
}
