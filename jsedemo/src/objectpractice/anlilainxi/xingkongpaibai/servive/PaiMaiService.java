package objectpractice.anlilainxi.xingkongpaibai.servive;

import objectpractice.anlilainxi.xingkongpaibai.dao.PaiMaidao;
import objectpractice.anlilainxi.xingkongpaibai.pojo.PaiMai;

public class PaiMaiService {
    public String pmlj(){
        PaiMaidao s = new PaiMaidao();
       String d =  s.cl();
        return d;
    }
    public String shangpinlj(int m){
        PaiMaidao o = new PaiMaidao();
        String u = o.shangpinljsz(m);
        return u;
    }
    public String shangpinlj2(String name){
        PaiMaidao o = new PaiMaidao();
        String u = o.shangpinljsz2(name);
        return u;
    }
        public String pmljsd(){
            PaiMaidao v = new PaiMaidao();
            String d =  v.pmljs();
            return d;
        }
}
