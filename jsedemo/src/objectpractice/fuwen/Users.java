package objectpractice.fuwen;

public class Users {
    private String name;
    private int password;
    public Users(String name,int password){
        this.name = name;
        this.password = password;
    }
    public String getname(){
        return name;
    }
    public int getpassword(){
        return password;
    }
}
