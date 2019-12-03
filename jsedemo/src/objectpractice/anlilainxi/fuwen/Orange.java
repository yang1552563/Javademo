package objectpractice.anlilainxi.fuwen;

public class Orange extends FuWen{
    String adHurt;//物理攻击
    String adSpeed;//攻击速度
    String crit;//暴击率
    String maxlife;//最大生命
    String adpass;//穿透
    String shengming;//生命
    String xixue;//吸血
    String fangyu;//防御
    //有参构造方法
    public Orange(String oname,String color,String category,String level,String adHurt,String adSpeed,String crit,String maxlife,String adpass){
        this.ename = oname;
        this.color = color;
        this.category = category;
        this.level = level;
        this.adHurt = adHurt;
        this.adSpeed = adSpeed;
        this.crit = crit;
        this.maxlife = maxlife;
        this.adpass = adpass;
    }
    //成员方法（把属性的值取出来）

    public String getAdHurt(){
        return this.adHurt;
    }
    public String getAdSpeed(){
        return this.adSpeed;
    }
    public String getCrit(){
        return this.crit;
    }
    public String getMaxlife(){
        return this.maxlife;
    }
    public String getAdpass(){
        return this.adpass;
    }
}
