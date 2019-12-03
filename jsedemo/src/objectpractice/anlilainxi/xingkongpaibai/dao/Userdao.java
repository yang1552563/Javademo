package objectpractice.anlilainxi.xingkongpaibai.dao;


import objectpractice.anlilainxi.xingkongpaibai.pojo.Bx;
import objectpractice.anlilainxi.xingkongpaibai.pojo.PaiMai;
import objectpractice.anlilainxi.xingkongpaibai.pojo.Users;
import objectpractice.anlilainxi.xingkongpaibai.servive.UserService;

import static objectpractice.anlilainxi.xingkongpaibai.dao.PaiMaidao.pm;

public class Userdao {
    public static Users[] use = new Users[10];

    public Users shuzu(String name, int password) {
        for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                if (use[i].getName().equals(name) && use[i].getPassword() == password) {
                    return use[i];
                }
            }
        }
        return null;
    }

    public Users zhuce(Users u) {
        for (int i = 0; i < use.length; i++) {
            if (use[i] == null) {
//                use [i].getUs()[0] = ddd;
                use[i] = u;
                return use[i];
            }
        }
        return null;
    }

    //登录
    public int dlshuzu(String name, int password) {
        for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                if (use[i].getName().equals(name) && use[i].getPassword() == password) {
                    int d = use[i].getMoney();
                    return d;
                }
            }
        }
        return -1;
    }

    public int zijinsz(int t, String g) {
        for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                if (use[i].getName().equals(g)) {
                    if (t <= 100 && t > 0) {
                        int f = use[i].getMoney();
                        f = f + t;
                        use[i].setMoney(f);
                        return f;
                    }

                }
            }
        }
        return -1;
    }

    public String sss(String ss) {
        Bx dd = new Bx(1, 120, "劳力士", "徐冰","自动机械,35毫米","防火");
        Bx dd1 = new Bx(2, 150, "威尼斯", "福特","手动，25毫米","防水");
        Bx dd2 = new Bx(3, 80, "丰田", "搭街坊","自动机械，48毫米","抗摔");
        Bx dd3 = new Bx(4, 93, "大帝", "萨替","自动机械，66毫米","钢化");
        Bx dd4 = new Bx(5, 66, "底阀", "哈佛","自动机械，42毫米","绝缘");
        for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                if (use[i].getName().equals(ss)) {
                    for (int p = 0; p < use[i].getUs().length; p++) {
                        use[i].getUs()[0] = dd;
                        use[i].getUs()[1] = dd1;
                        use[i].getUs()[2] = dd2;
                        use[i].getUs()[3] = dd3;
                        use[i].getUs()[4] = dd4;
                        break;
//                        }
                    }
                }
            }
        }
        for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                for (int d = 0; d < use[i].getUs().length; d++) {
                    if (use[i].getUs()[d] != null) {
                        System.out.println("序号：" + use[i].getUs()[d].getXuhao() + "名称:" + use[i].getUs()[d].getName() + "金额:" + use[i].getUs()[d].getJine() + "描述:" + use[i].getUs()[d].getMiaoshu());
                    }
                }
            }
        }
        return "";
    }

    public String sssaa(int sss, String gf) {
        for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                if (use[i].getName().equals(gf)) {
                    for (int p = 0; p < use[i].getUs().length; p++) {
                        if (use[i].getUs()[p] != null) {
                            if (use[i].getUs()[p].getXuhao() == sss) {
                                System.out.println("序号：" + use[i].getUs()[p].getXuhao() + "名称" + use[i].getUs()[p].getName() + "金额" + use[i].getUs()[p].getJine() + "描述" + use[i].getUs()[p].getMiaoshu());
                            }

                        }

                    }
                }
            }
        }
        return "";
    }

    public String sssaagg(int dfd, String gh) {
        out:for (int i = 0; i < use.length; i++) {
            if (use[i] != null) {
                if (use[i].getName().equals(gh)) {
                    for (int p = 0; p < use[i].getUs().length; p++) {
                        if (use[i].getUs()[p] != null) {
                            if (use[i].getUs()[p].getXuhao() == dfd) {
                                PaiMai fgf = new PaiMai(0, use[i].getUs()[p].getName(), use[i].getUs()[p].getPinpai(),use[i].getUs()[p].getJine(),use[i].getUs()[p].getZuogong(),use[i].getUs()[p].getMiaoshu(), use[i].getUs()[p].getGongneng());
                                System.out.println("序号：" + use[i].getUs()[p].getXuhao() + "名称" + use[i].getUs()[p].getName() + "金额" + use[i].getUs()[p].getJine() + "描述" + use[i].getUs()[p].getMiaoshu());
                                use[i].getUs()[p] = null;
                                for (int u = 0; u < use[i].getUs().length; u++)
                                {
                                    if (use[i].getUs()[p] !=null){
                                        System.out.println(use[i].getUs()[p]);
                                    }
                                }
                                for (int k= 0;k<pm.length;k++){
                                    if (pm[k] == null){
                                        pm[k] = fgf;
                                        break out;
                                    }
                                }
                                }

                            }

                        }

                    }
                }
            }
            return "上架成功";
        }

    }



