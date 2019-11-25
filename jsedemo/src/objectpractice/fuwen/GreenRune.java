package objectpractice.fuwen;

public class GreenRune extends FuWen {
    private String cool;//冷却缩减
    private String addefense;//物理防御
    private String adHurt;//物理攻击
    private String apdefense;//法术防御
    private String adSpeed;//攻击速度
    private String apblood;//法术吸血

    //有参构造方法
    public GreenRune(String gname,String color,String category,String level,String cool,String addefense,String adHurt,String apdefense,String adSpeed,String apblood){
        this.ename = gname;
        this.color = color;
        this.category = category;
        this.level = level;
        this.cool = cool;
        this.addefense = addefense;
        this.adHurt = adHurt;
        this.apdefense = apdefense;
        this.adSpeed = adSpeed;
        this.apblood = apblood;
    }

    //成员方法
    public String getCool(){
        return this.cool;
    }
    public String getAddefense(){
        return this.addefense;
    }
    public String getAdHurt(){
        return this.adHurt;
    }
    public String getApdefense(){
        return this.apdefense;
    }
    public String getAdSpeed(){
        return this.adSpeed;
    }
    public String getApblood(){
        return this.apblood;
    }
}
