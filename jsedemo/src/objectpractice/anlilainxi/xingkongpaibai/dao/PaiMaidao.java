package objectpractice.anlilainxi.xingkongpaibai.dao;

import objectpractice.anlilainxi.xingkongpaibai.pojo.Bx;
import objectpractice.anlilainxi.xingkongpaibai.pojo.PaiMai;
import objectpractice.anlilainxi.xingkongpaibai.pojo.Users;

public class PaiMaidao {
    public static PaiMai[] pm = new PaiMai[15];

    public static String cl() {
        PaiMai a = new PaiMai(1, "116610LV", "劳力士", 70, "耗式钢", "系列：潜航者===别名：绿水鬼===机芯类型：自动机械===表径：40毫米", "防水抗摔，高端靓丽");
        pm[0] = a;
        PaiMai b = new PaiMai(2, "Lfd.6", "欧米茄", 40, "精钢", "系列：裂纹者===别名：空中超人===机芯类型：自动机械===表径：38毫米", "精确守时，年轻时尚");
        pm[1] = b;
        PaiMai c = new PaiMai(3, "Cal.L678", "浪琴", 25, "精钢", "系列：卡卡===别名：水手===机芯类型：自动机械===表径：55毫米", "机械系统，古典风格");
        pm[2] = c;
        PaiMai d = new PaiMai(4, "Wal.3135", "劳力士", 66, "耗式钢", "系列：神话===别名：范甘迪===机芯类型：自动机械===表径：35毫米", "雍容淡雅，成熟大气");
        pm[3] = d;
        PaiMai e = new PaiMai(5, "Ksc.p33", "欧米茄", 480, "耗式钢", "系列：洛可可===别名：弗格森===机芯类型：自动机械===表径：43毫米", "精确守时，年轻时尚");
        pm[4] = e;
        PaiMai f = new PaiMai(6, "Ser.k55", "浪琴", 335, "精钢", "系列：多瑙河===别名：景福宫===机芯类型：自动机械===表径：46毫米", "防水抗摔，高端靓丽");
        pm[5] = f;
        PaiMai g = new PaiMai(7, "Jsd.c59", "爱彼", 1500, "精钢", "系列：汇添富===别名：海棠花===机芯类型：自动机械===表径：32毫米", "雍容淡雅，成熟大气");
        pm[6] = g;
        PaiMai h = new PaiMai(8, "A44ft", "爱彼", 2500, "玫瑰金", "系列：灰姑娘===别名：耐候钢===机芯类型：自动机械===表径：20毫米", "机械系统，古典风格");
        pm[7] = h;
        PaiMai i = new PaiMai(9, "Sdd.Y99", "积家", 58, "耗式钢", "系列：徐冰===别名：苟富贵===机芯类型：自动机械===表径：35毫米", "机械系统，古典风格");
        pm[8] = i;
        PaiMai j = new PaiMai(10, "Hui.r8", "劳力士", 100, "耗式钢", "系列：卡卡===别名：恒天然===机芯类型：自动机械===表径：55毫米", "机械系统，古典风格");
        pm[9] = j;
        for (int u = 0; u < pm.length; u++) {
                if (pm[u] != null) {
                    System.out.println( "名称："+pm[u].getName());
                    System.out.println( "序号："+pm[u].getXuhao());
                    System.out.println( "品牌："+pm[u].getPinpai());
                    System.out.println( "价格："+pm[u].getPrice());
                    System.out.println( "做工："+pm[u].getZuogong());
                    System.out.println("功能："+pm[u].getGongneng());
                    System.out.println("===========================");
            }
        }
        return "";
        }
    public String shangpinljsz(int m) {
        for (int u = 0; u < pm.length - 1; u++) {
            if (pm[u] != null) {
                if (pm[u].getXuhao() == m) {
                    String d = "你选择的商品序号:" + m + "商品详情：" + pm[u].getShangpinxq() + pm[u].getGongneng();
                    return d;
                }
            }
        }
        return "没有你要选择的序号，请重试";
    }

    public String shangpinljsz2(String name) {
        for (int u = 0; u < pm.length - 1; u++) {
            if (pm[u] != null) {
                if (pm[u].getName().equals(name)) {
                    String d = "你选择的商品名称:" + name + "商品详情：" + pm[u].getShangpinxq() + pm[u].getGongneng();
                }
            }
        }
        return "没有你要选择的序号，请重试";
    }
    public String pmljs() {
        //                if (pm[k] != null) {
        for (int u = 0; u < pm.length - 1; u++)
            for (int k = 0; k < pm.length - 1 - u; k++) {
                if (!(pm[k + 1].getPrice() < pm[k].getPrice())) {
                    continue;
                }
                PaiMai temp = pm[k + 1];
                pm[k + 1] = pm[k];
                pm[k] = temp;
//                    }
            }
        for (int t = 0; t < pm.length; t++) {
//            if ( pm[t] != null ) {
            System.out.println("序号：" + pm[t].getXuhao() + "====型号：" + pm[t].getName() + "====品牌：" + pm[t].getPinpai() + "====价格：" + pm[t].getPrice() + "====做工：" + pm[t].getZuogong());
//            }
        }
        return "";
    }
}
