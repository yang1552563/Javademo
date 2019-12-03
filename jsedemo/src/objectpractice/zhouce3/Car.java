package objectpractice.zhouce3;

public class Car {
    public  String color ;
    public String uerName;
    public Car(){
    }

    public Car(String color ,String uerName){
        this.color = color;
        this.uerName = uerName;
    }
    public static void use (){
        System.out.println("我是机动车");
    }
    public static boolean equals(Car car1,Car car2){
        if (car1.color.equals(car2.color)&&car2.uerName.equals(car2.uerName)){
            return true;
        }
        return false;
    }

    }

