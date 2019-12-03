package objectpractice.Jc;

public class Son extends Father {
    //第四题
//第五题
/*    public void function(){
        System.out.println(num);//子类不能调用父类的私有树熊
        System.out.println(num2);
    }*/
//第六题
   /* public int num2 = 20 ;
    public int num = 30;
    public void show (){
        int num = 40;
        System.out.println(num);
        System.out.println(num2);*/
    //第七题
 /*   public void function (){
        System.out.println(num);//私有属性不能继承
        System.out.println(num2);*/
//    第八题
/*    public int num = 20 ;
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }*/
//第九题
/*public Son (){
    System.out.println("Son的无参构造方法");
}
public Son (String name){
    System.out.println("Son的带参构造方法");
}*/
//第十题
/*    public Son (){
        super ("随便给");
        System.out.println("Son的无参构造方法");
//        super ("随便给");
    }
    public Son (String name){
        super ("随便给");
//        this();
        System.out.println("Son的带参构造方法");

    }*/
//第十一题
/*    public void method (){
        System.out.println("method Son");

    }
    public void show (){
        System.out.println("show Son");
    }*/
//第十二题
//    public void call(String name) {
//        super.call(name);
//        System.out.println("可以听天气预报了");
//    }
/*    public int num = 20;
    public Son(){
        System.out.println("zi");
    }
    public void show (){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }*/
//十四题
/*static {
        System.out.println("静态代码块儿Zi");
    }
    {
        System.out.println("构造代码块Zi");
    }
    public Son (){
        System.out.println("构造方法zi");

    }*/
//第十五题
    //只要在extend后继承的类，直接先访问继承的类，继承的类中有方法，则默认访问无参构造方法，创建对象的时候就输出
/*    Y y = new Y ();
    Son(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Son ();
    }*/
/*    public void show (){
    num = 100;
    System.out.println(num);
    num2 = 200;
    System.out.println(num2);
}*/
//第十七题
//    int age = 10;
    //第十八题
/*    public int num = 1000;
    public int num2 = 200;
    public void show (){
        System.out.println("show Zi");
    }
    public void method (){
        System.out.println("method zi");
    }
    public static void function (){
        System.out.println("function Zi");
    }*/
//第十八题
/*    public void show (){
        System.out.println("show zi");
    }
    public void method (){
        System.out.println("method zi");
    }*/
/*public void show (){super.show();}
public void show2(){
    System.out.println("你");
}*/
}
