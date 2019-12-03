package objectpractice.anlilainxi.xingkongpaibai.controller;


import objectpractice.anlilainxi.xingkongpaibai.pojo.Users;
import objectpractice.anlilainxi.xingkongpaibai.servive.UserService;

public class UserController {
    UserService us = new UserService();
public String  chuancankz (String name ,int password){
    String f = us.chuancanlj(name,password);
    return f;
}
    public int  dlchuancankz (String name ,int password){
        int f = us.dlchuancanlj(name,password);
        return f;
    }
    public int zijin (int t,String g){
    UserService sdd = new UserService();
    int f = sdd.zijinslj(t,g);
    return f;
    }
    public String pdchuancankz (int t){
        UserService sd = new UserService();
        String f = sd.pd(t);
        return f;
    }
    public String pdsf(int u){
        UserService sdd = new UserService();
        String f = sdd.pd(u);
        return f;
    }
    public String psd(String dd){
        UserService sd = new UserService();
        String f = sd.pd(dd);
        return f;
    }
    public String psdff(int dd,String gh){
        UserService sd = new UserService();
        String f = sd.pdss(dd,gh);
        return f;
    }
    public String psdffh(int dd,String gh){
        UserService sdg = new UserService();
        String fg = sdg.pdssgg(dd,gh);
        return fg;
    }
}
