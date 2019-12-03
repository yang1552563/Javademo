package objectpractice.anlilainxi.xingkongpaibai.pojo;

public class PaiMai {
    private int xuhao;
    private String name;
    private String pinpai;
    private int price;
    private String zuogong;
    private String shangpinxq;
    private String gongneng;
    private String miaoshu;
    public PaiMai(int xuhao,String name,String pinpai,int price,String zuogong,String shangpinxq,String gongneng){
        this.xuhao = xuhao;
        this.name = name;
        this.pinpai = pinpai;
        this.price = price;
        this.zuogong = zuogong;
        this.shangpinxq = shangpinxq;
        this.gongneng = gongneng;
    }
    public int getXuhao() {
        return xuhao;
    }

    public String getName() {
        return name;
    }

    public String getPinpai() {
        return pinpai;
    }

    public int getPrice() {
        return price;
    }

    public String getZuogong() {
        return zuogong;
    }

    public String getShangpinxq() {
        return shangpinxq;
    }
public String getGongneng(){
        return gongneng;
}

    public void setXuhao(int xuhao) {
        this.xuhao = xuhao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setZuogong(String zuogong) {
        this.zuogong = zuogong;
    }

    public void setShangpinxq(String shangpinxq) {
        this.shangpinxq = shangpinxq;
    }

    public void setGongneng(String gongneng) {
        this.gongneng = gongneng;
    }
}

