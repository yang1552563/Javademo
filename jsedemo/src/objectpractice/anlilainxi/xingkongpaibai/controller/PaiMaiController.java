package objectpractice.anlilainxi.xingkongpaibai.controller;

import objectpractice.anlilainxi.xingkongpaibai.pojo.PaiMai;
import objectpractice.anlilainxi.xingkongpaibai.servive.PaiMaiService;

public class PaiMaiController {
    public String pmkz(){
        PaiMaiService f= new PaiMaiService();
        String g = f.pmlj();
        return g;
    }
    public String shangpincz(int m){
        PaiMaiService p= new PaiMaiService();
        String g = p.shangpinlj(m);
        return g;
    }
    public String shangpincze(String name){
        PaiMaiService p= new PaiMaiService();
        String g = p.shangpinlj2(name);
        return g;
    }
    public String shangpinczed() {
        PaiMaiService p = new PaiMaiService();
        String j = p.pmljsd();
        return j;
    }
}
