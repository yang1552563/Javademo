package objectpractice.zhouce3;

public class HomeCar extends Car {
   private int num;
   public HomeCar(String name, String color, int num){
    this.uerName =name;
    this.color = color;
    this.num = num;
   }

   public void display(){
       System.out.println(this.uerName+"拥有的"+this.color+"颜色的私家车有"+this.num+"座位");
   }
    public void display( int num2){
        System.out.println("家用汽车大多有"+num2+"个座位");
    }
}
