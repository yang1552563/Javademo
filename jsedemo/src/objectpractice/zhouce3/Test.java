package objectpractice.zhouce3;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("红色","张三");
        Car car2 = new Car("红色","张三");
        Car.use();
        boolean b = Car.equals(car,car2);
        System.out.println("car1和car2的引用比较为"+b);
        System.out.println("=========================");
        Taxi taxi = new Taxi();
        taxi.company("长生公司");
        taxi.ride();
        taxi.use();
        System.out.println(taxi.toString());
        System.out.println("==============================");
        HomeCar homeCar;
        homeCar = new HomeCar("孙二娘","蓝色",7);
        homeCar.display();
        homeCar.display(5);

    }

}
