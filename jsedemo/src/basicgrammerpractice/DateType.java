package basicgrammerpractice;

public class DateType {
    public static void main(String[] args) {
        //整数类型byte,short,int,long,
        //字符型
        System.out.println("北京\\上海");//单斜杠
        System.out.println("北京\'上海");//单引号
        System.out.println("北京\''上海");//双引号
        System.out.println("北京\r上海");//回车
        System.out.println("北京\n上海");//换行
        System.out.println("北京\f上海");//走纸换页
        System.out.println("北京\t上海");//横向跳格
        System.out.println("北京\b上海");//退格


        //浮点型分为单精度浮点型共32位，为float/双精度浮点型为64位，为double
        double r=45.0324,PI=3.141592653,ares=PI*r*r;
        System.out.println("圆的面积是：S="+ares);

        //boolean类型
        boolean b=false;
        System.out.println("b\tis"+b);
        System.out.println("b is"+b);
        System.out.println("b     is"    +b);

    }
}
