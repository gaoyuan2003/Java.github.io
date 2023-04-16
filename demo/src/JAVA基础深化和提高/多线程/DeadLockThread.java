package JAVA基础深化和提高.多线程;

//Lipstick
class Lipstick{

}

//Mirror
class Mirror{

}

class Makeup extends Thread{
    private int flag;
    private String girlName;

    static final Lipstick lipstick = new Lipstick();
    static final Mirror mirror = new Mirror();

    public Makeup(int flag,String girlName){
        this.flag = flag;
        this.girlName = girlName;
    }

    @Override
    public void run() {
        this.doMakeup();
    }

    /**
     * 开始化妆
     */
    public void doMakeup(){
        if(this.flag == 0){
            synchronized (lipstick){
                System.out.println(this.girlName+" 拿着口红");
            }
            synchronized (mirror){
                System.out.println(this.girlName+" 拿着镜子");
            }
        }else{
            synchronized (mirror){
                System.out.println(this.girlName+" 拿着镜子");
            }
            synchronized (lipstick){
                System.out.println(this.girlName+" 拿着口红");
            }
        }
    }

}

public class DeadLockThread {
    public static void main(String[] args) {
        new Makeup(0,"女孩1").start();
        new Makeup(1,"女孩2").start();
    }
}
