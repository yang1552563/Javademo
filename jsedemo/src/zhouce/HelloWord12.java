package zhouce;

public class HelloWord12 {
    public static void main(String[]args){
        int score=94;
        String sex="女";
        if (score>80&&sex=="女"){
            System.out.println("可进入女子组决赛");
        }
        else if (score>80&&sex=="男"){
            System.out.println("可进入男子组决赛");
        }
        else{
            System.out.println("不进入决赛");
        }
    }
}
