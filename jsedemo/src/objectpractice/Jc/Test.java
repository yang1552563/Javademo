package objectpractice.Jc;

public class Test {

    public static void main(String[] args) {
        //第一题
        //考察：私有属性和方法，创建对象在其他类不能进行调用
        //Error:(8, 29) java: num 在 objectpractice.Jc.Gf 中是 private 访问控制
        //Error:(10, 10) java: method() 在 objectpractice.Jc.Gf 中是 private 访问控制
      /*  Gf d = new Gf();
        System.out.println(d.num);
        d.show();
        d.method();
        d.function();*/

        //第二题
        //私有属性不能调用
        //Error:(22, 10) java: age 在 objectpractice.Jc.Gf 中是 private 访问控制
       /* Gf s = new Gf();
        s.show();
        System.out.println("---------");
        s.name = "小白";
        s.age = 27;
        s.setAge(27);
        s.show ();
        System.out.println("-------");
        s.age = -27;
        s.setAge(-27);
        s.show();
        System.out.println("--------");*/

        //第三题
        //静态方法只能调用静态成员变量和方法，不能调用非静态的
 /*  Gf t =new Gf();
   t.show();
   System.out.println("--------");
           t.method();
*/

        //第四题
        //在子类继承父类的时候，子类可以调用父类非私有的属性和方法，直接子类对象点父类公有方法就可以了
        //子类
       /* Son s =new Son();
        s.method();
        s.show();*/
        //第五题
      /* Son s = new Son ();
       s.method();//子类不能调用父类的私有方法
       s.show();
       s.function();*/
        ////第六题
        //子类继承父类的时候，先访问局部变量，再访问子类的变量再访问父类
   /*     Son s = new Son ();
        s.show ();*/
        //第七题
    /*    Son s = new Son ();
        s.method ();//私有方法不能进行调用
        s.show();
        s.function();*/
        //第八题
        //调用变量采用就近原则
        //调用本类直接this点属性，调用父类super点属性
/*    Son s = new Son();
    s.show();*/
//第九题
        //子类继承父类，且子类父类都有无参构造，先输出父类的无参构造，再输出子类的无参构造
/*        //子类继承父类，且调用子类的有参构造，先输出父类的无参构造，再输出子类的有参构造
        Son s =new Son();
        System.out.println("----------");
        Son s2 = new Son ("小白");*/
//第十题
        //对super,this的调用必须是构造方法中的第一个语句
/*        Son s = new Son ();
        System.out.println("--------------");
        Son ss = new Son ("小白");*/
//第十一题
        //成员方法方法访问顺序，先访问子类再访问父类
/*        Son s = new Son ();
        s.show();
        s.method();
//        s.fucntion();*/
//第十二题
        //super调用父类方法，及成员方法访问顺序，先访问子类再访问父类
   /*     Son np = new Son ();
        np.call("小白");*/
        //第十三题
        //构造方法默认继承子类，且在子类无参构造第一行继承
/*   Son z = new Son ();
   z.show();*/
//第十四题
        //静态代码块Fu
        //静态代码块儿Zi
        //构造代码块Fu
        //构造方法Fu
        //构造代码块Zi
        //构造方法zi
        //此为加载顺序
//        Son z = new Son();

//第十五题
        //只要在extend后继承的类，直接先访问继承的类，继承的类中有方法，则默认访问无参构造方法，创建对象的时候就输出
        // 第十六题
        //被final修饰的成员变量和成员方法不能进行再次赋值和重写
      /*  Son z = new Son ();
        z.show();*/
        //第十七题
        //被final修饰的内容不可已重新赋值
   /*     int x= 10;
        System.out.println(x);
        final int y = 10 ;
        y =100;
        System.out.println(y);
        System.out.println("------------");
        Son s = new Son ();
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);
        System.out.println("------------");
        final Son ss = new Son ();
        System.out.println(ss.age);
        ss.age = 100;
        System.out.println(ss.age);
        ss = new Son();*/
        //第十八题
        //父类引用指向子类对象
        // 成员变量  编译看左边，运行看左边
        //成员方法  编译看左边运行看右边，右边或者左边没有直接报错
        //
  /*      Father f = new Father();
        System.out.println(f.num);
        System.out.println(f.num2);
        f.show();
        f.method();
        f.function();*/
        //第十八题
/*        Father f = new Son ();
        f.show ();
        f.method();*/
//第十九题
/*
        Gf a = new Y();
        Y d = (Y)a;

        a = new Father();
        Father c = (Father)a;
        Y dd = (Y) a;
*/
//第二十题
        //父类引用指向子类对象，方法里套方法，里面的方法先从子类找
/*        Gf a = new Father();
        a.show();

        Father b = new Son ();
        b.show();*/
//第二十一题

/*
        Son d = new Son ();
        System.out.println(d.num);
*/
// Gf de= new Gf("teteeee");
        //第二二题
/*    Gf emp = new Y();
    emp.setName ("小白");
    emp.setId("czbk001");
    emp.setSalary(18000);
        System.out.println(
                emp.getName()+"---"+emp.getId()+"---"+emp.getSalary()}
                emp.work();
        System.out.println("------");
        emp = new Y("小红","czbk001",18000);
        System.out.println(emp.getName()+"---"+emp.getId()+"--"+emp.getSalary());
        emp.work();
        System.out.println("-------");
        Father m = new Father ();
        m.setName("小蓝");
        m.setId("czbk02");
        m.setSalary(8000);
        System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary());
        m.work();
        System.out.println("---");
        m = new Father("小子","dvnubi",2000);
        System.out.println(m.getName()+"---"+m.getId()+"---"+m.getSalary());
        m.work();
        m.work();*/
//23
/*        Inter i = new Son2();
        System.out.println(i.num);
        System.out.println(i.num2);
        i.num = 100;
        i.num2 = 200;
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Inter.num);
        System.out.println(Inter.num2);
        System.out.println("-------");*/
    }
}

