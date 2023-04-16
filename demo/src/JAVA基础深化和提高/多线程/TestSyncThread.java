package JAVA基础深化和提高.多线程;

//财会类
class CaiZhe {
    private String name;

    public CaiZhe(String name) {
        this.name = name;
    }

    //领取奖金
    public void money() {
        synchronized (CaiZhe.class) {
            System.out.println(this.name + " 表扬");
            System.out.println(this.name + " 感谢");
            System.out.println(this.name + " 拿钱");
            System.out.println(this.name + " 感谢");
            System.out.println(this.name + " 出门");
        }
    }
}

//定义程序员类
class Programmer{
    private String name;
    public Programmer(String name){
        this.name = name;
    }


    //打开电脑
    public void computer(){
        synchronized (this){
            System.out.println(this.name+" 接通电脑");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name+" 开机");
            System.out.println(this.name+" 启动");
        }
    }

    //编码
    public void coding(){
        synchronized (this){
            System.out.println(this.name+" idea启动编码");
        }
    }

    //wc方法
    public void wc() {
        synchronized ("1") {
            System.out.println(this.name+" 开门");
            System.out.println(this.name+" 进入");
            System.out.println(this.name+" 停留");
            System.out.println(this.name+" 出去");
            System.out.println(this.name+" 关门");
        }
    }

    //领取奖金
    public void money() {
        synchronized (Programmer.class) {
            System.out.println(this.name + " 表扬");
            System.out.println(this.name + " 感谢");
            System.out.println(this.name + " 拿钱");
            System.out.println(this.name + " 感谢");
            System.out.println(this.name + " 出门");
        }
    }
}

//领奖线程
class Money extends Thread{
    private Programmer p;
    public Money(Programmer p){
        this.p = p;
    }
    @Override
    public void run() {
        this.p.money();
    }
}

//打开电脑的线程
class Working1 extends Thread{
    private Programmer p;
    public Working1(Programmer p){
        this.p = p;
    }
    @Override
    public void run() {
        this.p.computer();
    }
}

//coding线程
class Working2 extends Thread{
    private Programmer p;
    public Working2(Programmer p){
        this.p = p;
    }

    @Override
    public void run() {
        this.p.coding();
    }
}

//wc线程
class WC extends Thread{
    private Programmer p;
    public WC(Programmer p){
        this.p = p;
    }

    @Override
    public void run() {
        this.p.wc();
    }
}

//领奖线程
class CMoney extends Thread{
    private CaiZhe p;
    public CMoney(CaiZhe p){
        this.p = p;
    }
    @Override
    public void run() {
        this.p.money();
    }
}

public class TestSyncThread {
    public static void main(String[] args) {
        /*Programmer p = new Programmer("li");
        Programmer p1 = new Programmer("pi");
        new Working1(p).start();
        new Working2(p).start();
        new Working1(p1).start();
        new Working2(p1).start();
        Programmer p1 = new Programmer("li");
        Programmer p2 = new Programmer("pi");
        new WC(p1).start();
        new WC(p2).start();*/
        Programmer p1 = new Programmer("li");
        Programmer p2 = new Programmer("pi");
        new Money(p1).start();
        new Money(p2).start();
        CaiZhe caiZhe = new CaiZhe("90");
        CaiZhe caiZhe1 = new CaiZhe("99");
        new CMoney(caiZhe).start();
        new CMoney(caiZhe1).start();

    }
}
