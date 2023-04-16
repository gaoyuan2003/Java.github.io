package JAVA基础深化和提高.多线程;


//管理者类
class Manger{
    private String name;

    public void cheer(String Name,String eName){
//        synchronized (this){
            System.out.println(Name+" 来到 "+eName+" 的面前");
            System.out.println(eName+" 拿起酒杯 ");
            System.out.println(Name+" 和 "+eName+" 干杯");
//        }

    }

    public Manger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//管理者线程
class MangerThread implements Runnable{
    private Manger manger;
    private String eName;
    public MangerThread(Manger manger,String eName){
        this.manger = manger;
        this.eName = eName;
    }
    @Override
    public void run() {
//        synchronized (this.manger){
            manger.cheer(this.manger.getName(),this.eName);
//        }

    }
}

//主线程
public class TestSyncThread2 {
    public static void main(String[] args) {
        Manger manger = new Manger("张三");
        new Thread(new MangerThread(manger,"li"),"MangerThread1").start();
        new Thread(new MangerThread(manger,"liu"),"MangerThread2").start();
    }
}
