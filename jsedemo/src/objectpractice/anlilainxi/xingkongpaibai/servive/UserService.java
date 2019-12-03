package objectpractice.anlilainxi.xingkongpaibai.servive;


import objectpractice.anlilainxi.xingkongpaibai.dao.Userdao;
import objectpractice.anlilainxi.xingkongpaibai.pojo.Bx;
import objectpractice.anlilainxi.xingkongpaibai.pojo.Users;

public class UserService {
      Userdao ud = new Userdao();
    public String chuancanlj(String name,int password){
        Users fh = ud.shuzu(name, password);
        if (fh !=null){
            return "该用户已经注册过";
        }
        //注册用户
        else {
            Users u = new Users();
            u.setName(name);
            u.setPassword(password);
            u.setMoney(0);
            u.setUs(new Bx[10]);
            Users s = ud.zhuce(u);
            if (s != null) {
                return "注册成功";
            }
            return null;
        }
    }
    public int dlchuancanlj(String name,int password) {
        int fh = ud.dlshuzu(name, password);
        if(fh != -1){
            return fh;
        }
        return -1;
    }
    public int zijinslj (int t,String g){
        Userdao dd = new Userdao();
       int s = dd.zijinsz(t,g);
        if (s != -1){
            return s;
        }
        return -1;
    }
    public String pd (int t){
        if (t >= 0 && t < 100) {
            return "你当前的资金为:" + t + "你当前的身份为平民";
        }
        if (t > 100 && t < 200) {
            return "你当前的资金为:" + t + "你当前的身份为地主";
        } else {
            return "你当前的资金为:" + t + "你当前的身份为土豪";
        }
    }
    public String pd(String dfd){
        Userdao dd = new Userdao();
        String uuu = dd.sss(dfd);
        return uuu;
    }
    public String pdss(int dfd,String gh){
        Userdao dd = new Userdao();
        String uuus = dd.sssaa(dfd,gh);
        return uuus;
    }
    public String pdssgg(int dfd,String gh){
        Userdao dd = new Userdao();
        String uuusv = dd.sssaagg(dfd,gh);
        return uuusv;
    }
    }

