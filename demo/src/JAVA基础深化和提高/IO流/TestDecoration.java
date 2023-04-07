package JAVA基础深化和提高.IO流;

public class TestDecoration {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone30");
        iphone.show();
        System.out.println("---------将具有投影能力的手机壳装在手机上-----------");
        TouyingIphone tp = new TouyingIphone(iphone);
        tp.show();

    }
}

class Iphone{
    private String name;
    public Iphone(String name){
        this.name = name;
    }
    public void show(){
        System.out.println("我是"+this.name+",可以在屏幕上显示");
    }
}

class TouyingIphone{
    public Iphone iphone;
    public TouyingIphone(Iphone iphone){
        this.iphone = iphone;
    }
    public void show(){
        iphone.show();
        System.out.println("还可以投影在墙壁上显示");
    }
}