package objectpractice.anlilainxi.xingkongpaibai.pojo;

public class Users {
   private String name;
   private int password;
   private int money;
   private static Bx[] us;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public static Bx[] getUs() {
        return us;
    }

    public void setUs(Bx[] us) {
        Users.us = us;
    }
}
