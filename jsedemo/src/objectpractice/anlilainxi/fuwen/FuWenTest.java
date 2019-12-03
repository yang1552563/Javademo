package objectpractice.anlilainxi.fuwen;
import java.util.Scanner;
public class FuWenTest {
    public static void main(String[] args) {
        Users[] yonghu = new Users[1000];//创建一个用户类的数据库
        BlueRune[] barr = new BlueRune[5];//创建蓝色符文数组
        GreenRune[] garr = new GreenRune[5];//创建历绿色符文数组
        Orange[] cfw = new Orange[5];//创建橙色符文数组
        String[] zfu = new String[9];//创建用户选择的符文数组
        for (int x = 1; x > 0; x++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("欢迎来到符文大陆");
            System.out.println("请开始注册");
            //将利用for循环进行注册登录页面
            for (int p = 1; p > 0; p++) {
                String name = sc.next();
                int password = sc.nextInt();
                Users yh = new Users(name, password);//创建用户对象，通过有参构造方法进行赋值

                int z = yhhs(yh.getname(), yh.getpassword(), yonghu, yh);//接受返回值，如果为1则注册成功显示用户名，密码
                //如果为为1，返回for循环继续录入，进行登录环节
                if (z == 1) {
                    System.out.println("该用户未注册过，你已注册成功");
                    System.out.println("你的用户名为：" + yh.getname());
                    System.out.println("你的密码为：" + yh.getpassword());
                    System.out.println("请开始登录");
                }
                //如果为2则说明该对象已存在，直接显示登录成功
                if (z == 2) {
                    System.out.println("该用户已注册过，登录成功");
                    System.out.println("你的符文组合为"+zfu[0]+","+zfu[1]+","+zfu[2]+","+zfu[3]+","+zfu[4]+","+zfu[5]+","+zfu[6]+","+zfu[7]+","+zfu[8]);
                    break;
                }
            }
            System.out.println("你已进入符文大陆");
            System.out.println("选择1为查看符文属性,并进行选择");
            int y = sc.nextInt();
            if (y == 1) {
                for (int o = 1; o > 0; o++) {
                    //创建三种颜色的对象
                    //橙色对象
                    Orange o1 = new Orange("勇气", "橙色", "攻击", "1级", "+0.60", "", "", "", "");
                    cfw[0] = o1;
                    Orange o2 = new Orange("白刃", "橙色", "攻速", "2级", "+0.70", "+0.20%", "", "", "");
                    cfw[1] = o2;
                    Orange o3 = new Orange("振奋", "橙色", "暴击", "3级", "", "+0.50%", "+0.30%", "", "");
                    cfw[2] = o3;
                    Orange o4 = new Orange("暴戾", "橙色", "生命", "4级", "+1.50", "", "", "+13.50", "");
                    cfw[3] = o4;
                    Orange o5 = new Orange("异变", "橙色", "穿透", "5级", "+2.00", "", "", "", "+3.60");
                    cfw[4] = o5;
                    System.out.println("以下为橙色符文：");
                    System.out.println("名字：" + cfw[0].ename + "--颜色：" + cfw[0].color + "--类型：" + cfw[0].category + "--等级：" + cfw[0].level + "--物理攻击：" + cfw[0].getAdHurt());
                    System.out.println("名字：" + cfw[1].ename + "--颜色：" + cfw[1].color + "--类型：" + cfw[1].category + "--等级：" + cfw[1].level + "--物理攻击：" + cfw[1].getAdHurt() + "--攻击速度" + cfw[1].getAdSpeed());
                    System.out.println("名字：" + cfw[2].ename + "--颜色：" + cfw[2].color + "--类型：" + cfw[2].category + "--等级：" + cfw[2].level + "--攻击速度：" + cfw[2].getAdSpeed() + "--暴击率" + cfw[2].getCrit());
                    System.out.println("名字：" + cfw[3].ename + "--颜色：" + cfw[3].color + "--类型：" + cfw[3].category + "--等级：" + cfw[3].level + "--物理攻击：" + cfw[3].getAdHurt() + "--最大生命" + cfw[3].getMaxlife());
                    System.out.println("名字：" + cfw[4].ename + "--颜色：" + cfw[4].color + "--类型：" + cfw[4].category + "--等级：" + cfw[4].level + "--物理攻击：" + cfw[4].getAdHurt() + "--物理穿透" + cfw[4].getAdpass());

                    System.out.println("请依次选择你的符文");

                    String a = sc.next();
                    String b = sc.next();
                    String c = sc.next();
                    //绿色对象
                    GreenRune g1 = new GreenRune("应激", "绿色", "功能", "1级", "+0.20%", "", "", "", "", "");
                    garr[0] = g1;
                    GreenRune g2 = new GreenRune("坚壁", "绿色", "防御", "2级", "", "+2.50", "", "", "", "");
                    garr[1] = g2;
                    GreenRune g3 = new GreenRune("风怒", "绿色", "攻击", "3级", "", "", "+0.40", "+2.90", "", "");
                    garr[2] = g3;
                    GreenRune g4 = new GreenRune("奇袭", "绿色", "攻速", "4级", "+0.50%", "", "", "", "+0.40%", "");
                    garr[3] = g4;
                    GreenRune g5 = new GreenRune("敬畏", "绿色", "吸血", "5级", "", "+5.90", "", "", "", "+0.70%");
                    garr[4] = g5;
                    System.out.println("以下为绿色符文：");
                    System.out.println("\r");
                    System.out.println("名字：" + garr[0].ename + "--颜色：" + garr[0].color + "--类型：" + garr[0].category + "--等级：" + garr[0].level + "--冷却缩减：" + garr[0].getCool());
                    System.out.println("名字：" + garr[1].ename + "--颜色：" + garr[1].color + "--类型：" + garr[1].category + "--等级：" + garr[1].level + "--物理防御：" + garr[1].getAddefense());
                    System.out.println("名字：" + garr[2].ename + "--颜色：" + garr[2].color + "--类型：" + garr[2].category + "--等级：" + garr[2].level + "--物理攻击：" + garr[2].getAdSpeed() + "--法术防御" + garr[2].getApdefense());
                    System.out.println("名字：" + garr[3].ename + "--颜色：" + garr[3].color + "--类型：" + garr[3].category + "--等级：" + garr[3].level + "--冷却缩减：" + garr[3].getCool() + "--攻击速度" + garr[3].getAdSpeed());
                    System.out.println("名字：" + garr[4].ename + "--颜色：" + garr[4].color + "--类型：" + garr[4].category + "--等级：" + garr[4].level + "--物理防御：" + garr[4].getAddefense() + "--法术吸血" + garr[4].getApblood());
                    System.out.println("请依次选择你的符文");
                    String f = sc.next();
                    String g = sc.next();
                    String h = sc.next();

                    //蓝色对象
                    BlueRune b1 = new BlueRune("活力", "蓝色", "生命", "1级", "+15.00", "", "", "", "", "");
                    barr[0] = b1;
                    BlueRune b2 = new BlueRune("刚毅", "蓝色", "攻击", "2级", "", "+0.30", "+0.40%", "", "", "");
                    barr[1] = b2;
                    BlueRune b3 = new BlueRune("绽放", "蓝色", "功能", "3级", "+12.00", "", "", "+4.20", "", "");
                    barr[2] = b3;
                    BlueRune b4 = new BlueRune("吞噬", "蓝色", "吸血", "4级", "", "", "+0.80%", "", "+0.40%", "");
                    barr[3] = b4;
                    BlueRune b5 = new BlueRune("兽痕", "蓝色", "暴击", "5级", "+60.00", "", "", "", "", "+0.50%");
                    barr[4] = b5;
                    System.out.println("以下为蓝色符文：");
                    System.out.println("名字：" + barr[0].ename + "--颜色：" + barr[0].color + "--类型：" + barr[0].category + "--等级：" + barr[0].level + "--最大生命：" + barr[0].getMaxlife());
                    System.out.println("名字：" + barr[1].ename + "--颜色：" + barr[1].color + "--类型：" + barr[1].category + "--等级：" + barr[1].level + "--物理攻击：" + barr[1].getAdHurt() + "--物理吸血：" + barr[1].getAdblood());
                    System.out.println("名字：" + barr[2].ename + "--颜色：" + barr[2].color + "--类型：" + barr[2].category + "--等级：" + barr[2].level + "--最大生命：" + barr[2].getMaxlife() + "--每5秒回血" + barr[2].getFive());
                    System.out.println("名字：" + barr[3].ename + "--颜色：" + barr[3].color + "--类型：" + barr[3].category + "--等级：" + barr[3].level + "--物理吸血：" + barr[3].getAdblood() + "--移速" + barr[3].getMovespeed());
                    System.out.println("名字：" + barr[4].ename + "--颜色：" + barr[4].color + "--类型：" + barr[4].category + "--等级：" + barr[4].level + "--最大生命：" + barr[4].getMaxlife() + "--暴击率" + barr[4].getCrit());
                    System.out.println("请依次选择你的符文");
                    String k = sc.next();
                    String l = sc.next();
                    String m = sc.next();
//        }
                    int e = fuwenxuanze(a, b, c, f, g, h, k, l, m,barr, garr, cfw);
                    if (e == 1) {
                        System.out.println("你选择的符文组合为：");
                        System.out.println("橙色符文：" + a + "，" + b + "，" + c);
                        System.out.println("绿色符文：" + f + "，" + g + "，" + h);
                        System.out.println("蓝色符文：" + k + "，" + l + "，" + m);
                        System.out.println("确认选择为请输入1");
                        int r = sc.nextInt();
                        if ( r == 1){
                            System.out.println("选择符文成功");
                            fuwenxuanzec(a, b, c, f, g, h, k, l, m,zfu);
                            System.out.println("你的符文组合为"+zfu[0]+","+zfu[1]+","+zfu[2]+","+zfu[3]+","+zfu[4]+","+zfu[5]+","+zfu[6]+","+zfu[7]+","+zfu[8]);
                            System.out.println("勇士去开启你新的征程吧");
                            break;
                        }
                        else {
                            System.out.println("请重新输入");
                            continue;
                        }
                    }
                    else {
                        System.out.println("你的输入有误，请重新输入");
                        continue;
                    }
                }
            }
        }
    }
//此为登录注册调用的方法
    public static int yhhs(String name, int password, Users[] yonghu, Users yh) {
        for (int i = 0; i < yonghu.length; i++) {
            if (yonghu[i] == null) {
                yonghu[i] = yh;
                return 1;
            }
            if (yonghu[i].getname().equals(name) && yonghu[i].getpassword() == (password)) {
                return 2;
            }
        }
        return -1;
    }

    public static int fuwenxuanze(String a, String b, String c, String f, String g, String h, String k, String
            l, String m, BlueRune[] barr, GreenRune[] garr, Orange[] cfw) {
        for (int i = 0; i < cfw.length ; i++) {
              /* if (cfw[i].ename.equals(a) || cfw[i].ename.equals(b) || cfw[i].ename.equals(c) || garr[i].ename.equals(f) || garr[i].ename.equals(g) || garr[i].ename.equals(h) || barr[i].ename.equals(k) || barr[i].ename.equals(l) || barr[i].ename.equals(m))
                {
                    return 1;
                }*/
              if (cfw[i] != null){
                  if (cfw[i].ename.equals(a)){
                      for (int j = 0; j < cfw.length; j++){
                          if (cfw[j].ename.equals(b)){
                              for (int q = 0; q < cfw.length; q++) {
                                  if (cfw[q].ename.equals(c)){
                                      for (int w = 0; w < garr.length; w++){
                                          if (garr[w].ename.equals(f)){
                                              for (int r = 0; r < garr.length; r++){
                                                  if (garr[r].ename.equals(g)){
                                                      for (int t = 0; t < garr.length; t++){
                                                          if (garr[t].ename.equals(h)){
                                                              for (int y = 0; y < barr.length; y++){
                                                                  if (barr[y].ename.equals(k)){
                                                                      for (int u = 0; u < barr.length; u++){
                                                                          if (barr[u].ename.equals(l)){
                                                                              for (int o = 0; o < barr.length; o++){
                                                                                  if (barr[o].ename.equals(m)){
                                                                                      return 1;
                                                                                  }
                                                                              }
                                                                              continue;
                                                                          }
                                                                      }
                                                                      continue;
                                                                  }
                                                              }
                                                              continue;
                                                          }
                                                      }
                                                      continue;
                                                  }
                                              }
                                              continue;
                                          }
                                      }
                                      continue;
                                  }
                              }
                              continue;
                          }
                      }

                      continue;
                  }
              }
                }
        return -1;
            }
    public static int fuwenxuanzec(String a, String b, String c, String f, String g, String h, String k, String
            l, String m,String[] zfu){
        for (int i = 0; i < zfu.length ; i++){
            if (zfu[i] == null) {
                zfu[0] = a;
                zfu[1] = b;
                zfu[2] = c;
                zfu[3] = f;
                zfu[4] = g;
                zfu[5] = h;
                zfu[6] = k;
                zfu[7] = l;
                zfu[8] = m;
                return 1;
            }
        }
        return -1;
    }

    }
