package objectpractice.shangdian;

import java.util.Scanner;
public class Object {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        //准备开店
        Clothes d1=new Clothes();
        Clothes d2=new Clothes();
        Clothes d3=new Clothes();
        //定义商品属性
        d1.price="￥160";
        d1.color="black";
        d1.style="风衣";
        d2.price="￥120";
        d2.color="white";
        d2.style="运动服";
        d3.price="￥140";
        d3.color="yellow";
        d3.style="休闲服";
        //准备一个货架
        Clothes []arr =new Clothes [3];
        arr[0]=d1;
        arr[1]=d2;
        arr[2]=d3;
        System.out.println("===========");
        System.out.println("欢迎来到我的小店");
        System.out.println("请选购商品：");
        //通过遍历数组，取出所有商品并展示
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=null){
                System.out.println("商品序号："+i+"商品名称"+arr[i].style+"商品价格"+arr[i].price);
            }
        }
        System.out.println("请选择自己喜欢的商品序号");
        int k=sc.nextInt();
        if (k<arr.length && k>=0) {
            System.out.println("商品序号："+k+"商品名称"+arr[k].style+"商品价格"+arr[k].price);
        }else{
            System.out.println("你选择的商品"+k+"不存在");
        }

        }
}
