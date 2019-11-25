package objectpractice.fuwen;

public class BlueRune extends FuWen {
    String maxlife;//最大生命
    String adHurt;//物理攻击
    String adblood;//物理吸血
    String five;//每五秒回血
    String movespeed;//移速
    String crit;//暴击
    //有参构造方法
    public BlueRune(String bname,String color,String category,String level,String maxlife,String adHurt,String adblood,String five,String movespeed,String crit){
        this.ename = bname;
        this.color = color;
        this.category = category;
        this.level = level;
        this.maxlife = maxlife;
        this.adHurt = adHurt;
        this.adblood = adblood;
        this.five = five;
        this.movespeed = movespeed;
        this.crit = crit;
    }
    //成员方法
    public String getMaxlife(){
        return this.maxlife;
    }
    public String getAdHurt(){
        return this.adHurt;
    }
    public String getAdblood(){
        return this.adblood;
    }
    public String getFive(){
        return this.five;
    }
    public String getMovespeed(){
        return this.movespeed;
    }
    public String getCrit(){
        return this.crit;
    }
}
