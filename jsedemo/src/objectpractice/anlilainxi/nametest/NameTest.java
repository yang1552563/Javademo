package objectpractice.anlilainxi.nametest;

import java.util.Scanner;
public class NameTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建数组
        Users[] yh = new Users[100];
        Datas[] ds = new Datas[36];

        //注册
        for (int p = 0; p >= 0; p++) {
            out:
            for (int i = 0; i < yh.length; i++) {
                System.out.println("欢迎来到前世的名字测试页面，下面来测测你前世的名字吧");
                System.out.println("如果你未注册过，请选择1进行注册，如果你已注册过，请输入任意值进行登录");
                int b = sc.nextInt();
                if (b == 1) {
//                        bn:for (int u = 0; u < yh.length; u++) {
                    System.out.println("请输入名字、密码、生肖、月份、星座");
                    String name = sc.next();//输入名字
                    int mima = sc.nextInt();//输入密码
                    String shengxiao = sc.next();//输入生肖
                    int yuefen = sc.nextInt();//输入月份
                    String xingzuo = sc.next();//输入星座
                    Users yonghu = new Users(name, mima, shengxiao, yuefen, xingzuo);//创建对象，将数据传递给对象
                    String newname = yonghu.getname();//利用普通成员方法将对象的私有属性调用展示出来
                    String newshengxiao = yonghu.getshengxiao();//利用普通成员方法将对象的私有属性调用展示出来
                    String newxingzuo = yonghu.getxingzuo();//利用普通成员方法将对象的私有属性调用展示出来
                    int newmima = yonghu.getmima();//利用普通成员方法将对象的私有属性调用展示出来
                    int newyuefen = yonghu.getyuefen();//利用普通成员方法将对象的私有属性调用展示出来
                    System.out.println("确认你的选择为1");
                    int x = sc.nextInt();
                    if (x == 1) {
                        int jzc = zhuce(name, shengxiao, xingzuo, mima, yuefen, yonghu, yh);//将输入的数据作为传递给注册方法
                        if (jzc == 1) {//如果数组有空位置，将对象放入数组，并将普通成员方法展示出来的属性输出
                            System.out.println("你的名字为：" + newname);
                            System.out.println("你的密码为：" + newmima);
                            System.out.println("你的生肖为：" + newshengxiao);
                            System.out.println("你的月份为：" + newyuefen);
                            System.out.println("你的星座为：" + newxingzuo);

                        }
              /*              else {//如果没有按照正确的数据类型进行输入，则显示不正确的输入
                                System.out.println("不正确输入，请重新注册");*/
                    }
                }
//            }
//                }
                else {
                    //开始登录
                    System.out.println("请输入你的用户名，密码");
                    String c = sc.next();
                    int v = sc.nextInt();
                    int s = denglu(c, v, yh);
                    if (s == 1) {
                        System.out.println("登录成功");
                        break;
                    } else {
                        System.out.println("该用户未进行注册，请前往注册");
                        continue out;
                    }
                }
            }
            //用户最后需要输入生肖、月份、星座三个值，可以将每种数据作为一个对象创建，看用户最终选哪个，就取出那个，然后进行叠加，就是他的新名字
            //从这里我学习到，用户输入一个值来匹配另外一个值的时候，可以将他们综合起来创建一个类
            //创建原值和匹配值的对象，如果键盘录入值和这个对象对应的原来的属性一致，则输出令一个值
            Datas d = new Datas("生肖", "鸡", "苏");
            ds[0] = d;
            Datas d2 = new Datas("生肖", "马", "顾");
            ds[1] = d2;
            Datas d3 = new Datas("生肖", "羊", "夏");
            ds[2] = d3;
            Datas d4 = new Datas("生肖", "兔", "陌");
            ds[3] = d4;
            Datas d5 = new Datas("生肖", "龙", "夜");
            ds[4] = d5;
            Datas d6 = new Datas("生肖", "鼠", "上官");
            ds[5] = d6;
            Datas d7 = new Datas("生肖", "猪", "慕");
            ds[6] = d7;
            Datas d8 = new Datas("生肖", "猴", "楚");
            ds[7] = d8;
            Datas d9 = new Datas("生肖", "蛇", "陆");
            ds[8] = d9;
            Datas d10 = new Datas("生肖", "狗", "程");
            ds[9] = d10;
            Datas d11 = new Datas("生肖", "牛", "浴");
            ds[10] = d11;
            Datas d12 = new Datas("生肖", "虎", "玉");
            ds[11] = d12;
            Datas d13 = new Datas("月份", "1", "小");
            ds[12] = d13;
            Datas d14 = new Datas("月份", "2", "棂");
            ds[13] = d14;
            Datas d15 = new Datas("月份", "3", "玥");
            ds[14] = d15;
            Datas d16 = new Datas("月份", "4", "浅");
            ds[15] = d16;
            Datas d17 = new Datas("月份", "5", "瑾");
            ds[16] = d17;
            Datas d18 = new Datas("月份", "6", "颜");
            ds[17] = d18;
            Datas d19 = new Datas("月份", "7", "曦");
            ds[18] = d19;
            Datas d20 = new Datas("月份", "8", "夭");
            ds[19] = d20;
            Datas d21 = new Datas("月份", "9", "眠");
            ds[20] = d21;
            Datas d22 = new Datas("月份", "10", "晴");
            ds[21] = d22;
            Datas d23 = new Datas("月份", "11", "莹");
            ds[22] = d23;
            Datas d24 = new Datas("月份", "12", "瑶");
            ds[23] = d24;
            Datas d25 = new Datas("星座", "白羊座", "浅");
            ds[24] = d25;
            Datas d26 = new Datas("星座", "金牛座", "姬");
            ds[25] = d26;
            Datas d27 = new Datas("星座", "巨蟹座", "盈");
            ds[26] = d27;
            Datas d28 = new Datas("星座", "天蝎座", "晞");
            ds[27] = d28;
            Datas d29 = new Datas("星座", "双子座", "儿");
            ds[28] = d29;
            Datas d30 = new Datas("星座", "射手座", "璃");
            ds[29] = d30;
            Datas d31 = new Datas("星座", "狮子座", "衣");
            ds[30] = d31;
            Datas d32 = new Datas("星座", "处女座", "仪");
            ds[31] = d32;
            Datas d33 = new Datas("星座", "天秤座", "之");
            ds[32] = d33;
            Datas d34 = new Datas("星座", "双鱼座", "绯");
            ds[33] = d34;
            Datas d35 = new Datas("星座", "水瓶座", "色");
            ds[34] = d35;
            Datas d36 = new Datas("星座", "摩羯座", "蓉");
            ds[35] = d36;

            //此为测试区
            System.out.println("请输入生肖、月份、星座");
            String sx2 = sc.next();
            String mon2 = sc.next();
            String xz2 = sc.next();
            String newName = startGame(sx2, mon2, xz2, ds);
            System.out.println("你前世的名字是：" + newName);
            continue;
        }
    }
//此为main方法区域
    public static int zhuce(String name,String shengxiao,String xingzuo,int mima ,int yuefen, Users yonghu,Users[] yh) {
        //将键盘录入的数据传进来，与数组已有的内容进行比较
     /*  Users yonghu = new Users();
       yonghu.name = name;
       yonghu.mima = mima;
       yonghu.shengxiao = shengxiao;
       yonghu.yuefen = yuefen;
       yonghu.xingzuo = xingzuo;*/
     //上面为直接对象。属性的方式赋值，不利于私有性的体现
        for (int i = 0; i < yh.length; i++) {
            //for循环遍历数组
                //数组有空位，则保存对象的地址
                if (yh[i] == null) {
                    yh[i] = yonghu;
                    return 1;
            }
        //到此为for循环区域
    }
        return 0;
    }
    //此为注册方法区域

    public static int denglu(String yonghum,int mima,Users[] yh){
        for (int i =0;i<yh.length;i++){
            if (yh[i] != null){
                if (yh[i].getname().equals(yonghum)&&yh[i].getmima() == mima){
                    return 1;
                }
            }
        }
        return -1;
    }

    //开始测试
    public static String startGame(String sx,String mon,String xz,Datas[] ds){
        String newName = "";
//进行叠加的方式是引发该学习的，因为不写这一步，则输出值为null加后面的内容
        for(int i =0;i<ds.length;i++)
        //利用for循环遍历数组
        {
            //判断如果数组的那个位置不为空，再判断输入的值对应数组中的哪个对象的属性，最后进行叠加
            if(ds[i] != null){
                //生肖
                if(ds[i].category.equals("生肖")){
                    if(ds[i].yz.equals(sx)){
                        newName = newName+ds[i].xz;
                    }
                }
                //月份
                if(ds[i].category.equals("月份")){
                    if(ds[i].yz.equals(mon)){
                        newName = newName+ds[i].xz;
                    }
                }
                //星座
                if(ds[i].category.equals("星座")){
                    if(ds[i].yz.equals(xz)){
                        newName = newName+ds[i].xz;
                    }
                }
            }
        }

        return newName;
    }
}
//此为类区


