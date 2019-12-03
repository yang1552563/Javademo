package objectpractice.anlilainxi.xingkongpaibai;
import objectpractice.anlilainxi.xingkongpaibai.controller.PaiMaiController;
import objectpractice.anlilainxi.xingkongpaibai.controller.UserController;
import objectpractice.anlilainxi.xingkongpaibai.dao.PaiMaidao;
import objectpractice.anlilainxi.xingkongpaibai.pojo.PaiMai;
import objectpractice.anlilainxi.xingkongpaibai.servive.UserService;

import java.util.Scanner;

import static objectpractice.anlilainxi.xingkongpaibai.dao.PaiMaidao.pm;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i >= 0; i++) {
            System.out.println("注册选择1");
            System.out.println("登录选择2");
            int r = sc.nextInt();
            switch (r) {
                case 1:
                    System.out.println("请输入用户名");
                    String d = sc.next();
                    System.out.println("请输入密码");
                    int x = sc.nextInt();
                    UserController cz = new UserController();
                    String f = cz.chuancankz(d, x);
                    System.out.println(f);
                    if (f != null) {
                        System.out.println("=====" + "用户名：" + d + "=====密码：" + x + "====");
                    }
                case 2:
                    //用户登录
                    System.out.println("请开始登录");
                    System.out.println("请输入用户名");
                    String g = sc.next();
                    System.out.println("请输入密码");
                    int h = sc.nextInt();
                    UserController k = new UserController();
                    int dl = k.dlchuancankz(g, h);
                    if (dl == -1) {
                        System.out.println("该用户未注册，请返回首页进行注册");
                        continue;
                    } else {
                        System.out.println("登录成功");
                       out: for (int rr = 0; rr >= 0; rr++) {
                            System.out.println("欢迎来到万界拍卖行首页");
                            System.out.println("1为充值专栏");
                            System.out.println("2为拍卖品专栏");
                            System.out.println("3为购物车专栏");
                            System.out.println("4为结算专栏");
                            int s = sc.nextInt();
                            switch (s) {
                                case 1:
                                    UserController nn = new UserController();
                                    String nng = nn.pdchuancankz(dl);
                                    System.out.println(nng);
                                    one:
                                    for (int j = 0; j >= 0; j++) {
                                        UserController gg = new UserController();
                                        System.out.println("请输入你选择充值的金额，选择金额不能大于100");
                                        int t = sc.nextInt();
                                        int u = gg.zijin(t, g);
                                        if (u == -1) {
                                            System.out.println("你充值的金额大于100，请重新进行充值");
                                        } else {
                                            System.out.println("你充值的金额为" + t + "你当前的账户总金额为" + u);
                                            UserController ggf = new UserController();
                                            String yy = ggf.pdsf(u);
                                            System.out.println(yy);
                                            System.out.println("你是否还要继续进行充值继续为1，取消为2");
                                            int ddd = sc.nextInt();
                                            if (ddd == 1) {
                                                continue one;
                                            } else {
                                                break one;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    PaiMaiController b = new PaiMaiController();
                                    String v = b.pmkz();
                                    System.out.println(v);
                                    System.out.println("1：按序号查看物品详情");
                                    System.out.println("2：按名称查看物品详情");
                                    System.out.println("3：将百宝囊中的物品进行上架");
                                    System.out.println("4：按拍卖品金额高低排序展示");
                                    int n = sc.nextInt();
                                    switch (n) {
                                        case 1:
                                            System.out.println("请输入商品序号查看商品详情");
                                            PaiMaiController t = new PaiMaiController();
                                            int m = sc.nextInt();
                                            String c = t.shangpincz(m);
                                            System.out.println(c);
                                            break;
                                        case 2:
                                            System.out.println("请输入商品名称查看商品详情");
                                            PaiMaiController y = new PaiMaiController();
                                            String a = sc.next();
                                            String gg = y.shangpincze(a);
                                            System.out.println(gg);
                                            break;
                                        case 3:
                                            UserController ddd = new UserController();
                                            System.out.println("用户" + g + "的百宝箱：");
                                            String sd = ddd.psd(g);
                                            System.out.println(sd);
                                            System.out.println("1为上架商品");
                                            System.out.println("2为返回首页");
                                            int ss = sc.nextInt();
                                            switch (ss) {
                                                case 1:
                                                    out1:
                                                    for (int hh = 0; hh >= 0; hh++) {
                                                        System.out.println("请选择你要上架的商品（按序号选择）");
                                                        int ee = sc.nextInt();
                                                        System.out.println("用户" + g + "你选择的商品为：");
                                                        UserController dds = new UserController();
                                                        String sds = dds.psdff(ee, g);
                                                        System.out.println(sds);
                                                        System.out.println("1确认上架");
                                                        System.out.println("2取消上架");
                                                        int dsd = sc.nextInt();
                                                        switch (dsd) {
                                                            case 1:
                                                                UserController dd = new UserController();
                                                                String sdsk = dd.psdffh(ee, g);
                                                                System.out.println(sdsk);
                                                                System.out.println("1继续上架");
                                                                System.out.println("2取消上架，返回首页");
                                                                int aa = sc.nextInt();
                                                                if (aa == 1) {
                                                                    continue;
                                                                } else {
                                                                    break out;
                                                                }
                                                            case 2:
                                                                break out1;
                                                        }
                                                    }
                                                case 2:
                                            }
                                            System.out.println();
                                            break;
                                        case 4:
                                            System.out.println("==============" + "以下为按金额高低排好的商品详情" + "===============");
                                            PaiMaiController u = new PaiMaiController();
                                            String e = u.shangpinczed();
                                            System.out.println(e);
                                            break;
                                    }
                            }
                        }
                    }
                    }
                    }
            }
                }






