package objectpractice.zhouce3;

public class Taxi extends Car {
   private String company;
   public Taxi(){
       super("蓝色","张小泉");
   }
   public void company(String setcompany){
       this.company = setcompany;
   }
   public String getcompany(){
       return company;
   }
    public final void ride(){
        System.out.println(this.uerName+"出租车是所属于在"+getcompany());
    }
    public static void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }
    @Override
    public String toString() {
        return "Taxi的信息是："+this.uerName+"拥有一辆"+this.color+"的出租车";
    }
}
