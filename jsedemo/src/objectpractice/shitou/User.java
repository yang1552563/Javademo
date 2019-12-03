package objectpractice.shitou;

public class User {
    //属性
    private String name;
    private int password;
    //设置，取值
    public void setname(String name) {
        this.name = name;
    }
    public void setpassword(int password) {
        this.password = password;
    }
    public String getname(){
        return name;
    }
    public int getpassword(){
        return password;
    }
    //判断方法
    public String panduan( User [] yh,String name,int password, User user ){
        for (int i = 0 ;i<yh.length;i++){
            if (yh [i] != null){
               if ( yh[i].name.equals( name )&& yh[i].password == password){
                   return "你已注册过，不需要重新注册";
               }
               }
            else {
                yh [i] = user;
                return "你已注册成功";
            }
        }
        return "输入有误";
    }

}
