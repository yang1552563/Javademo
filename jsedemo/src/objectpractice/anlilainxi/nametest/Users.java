package objectpractice.anlilainxi.nametest;

public class Users {
    private String name;
    private int mima;
    private String shengxiao;
    private int yuefen;
    private String xingzuo;
//对象属性
    //有参构造方法赋值
    public  Users(String name ,int mima,String shengxiao,int yuefen,String xingzuo)//括号里的数据类型接受main方法内键盘录入的具体数据
    {
        this.name = name;//这个类此时的对象的name=外面传进来的数据
        this.mima = mima;
        this.shengxiao = shengxiao ;
        this.yuefen = yuefen;
        this.xingzuo = xingzuo;
        }
    /*    //还可以通过第二种方法赋值，然后在主函数中，通过对象。方法的方式进行赋值
    public void fuzhiname(String name){
        this.name = name;
    } public void fuzhishengxiao(String shengxiao){
        this.shengxiao = shengxiao;
    } public void fuzhixingzuo(String xingzuo){
        this.xingzuo = name;
    } public void fuzhiyuefen(int yuefen){
        this.yuefen = yuefen;}
        public void fuzhimima(int mima){
        this.mima = mima;
    }*/

        //此为普通成员方法
    public String getname( ) //main内，对象调用此方法，显示对应的属性具体数据
    {
        return name;//返回值为对象已有的具体属性值
    } public String getshengxiao( ) {
        return this.shengxiao;
    } public String getxingzuo( ) {
        return this.xingzuo;
    } public int getmima( ) {
        return this.mima;
    }public int getyuefen( ) {
        return this.yuefen;
    }
}
