package objectpractice.siyou;

class Car {
     String name;//私有成员，名称
    private String color;//私有成员，颜色
    private String size;//私有成员,大小
    public Car( String name,String color,String size ){
        this.name = name;
        this.color = color;
        this.size = size;
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

/*    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }*/
}



