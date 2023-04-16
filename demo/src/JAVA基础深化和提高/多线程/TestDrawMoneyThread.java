package JAVA基础深化和提高.多线程;

/**
 * 账户类
 */

class Account{
    //账号
    private String accountNO;
    //账户余额
    private double balance;

    public Account() {
    }

    public Account(String accountNO, double balance) {
        this.accountNO = accountNO;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

/**
 * 取款线程
 */

class DrawThread implements Runnable{
    //账户对象
    private Account account;
    //取款金额
    private double drawMoney;

    public DrawThread(){}

    public DrawThread(Account account, double drawMoney) {
        this.account = account;
        this.drawMoney = drawMoney;
    }

    /**
     * 取款线程体
     */

    @Override
    public void run() {
        synchronized (this.account) {
            //判断当前账户余额大于或等于取款金额
            if (this.account.getBalance() >= this.drawMoney) {
                System.out.println(Thread.currentThread().getName() + "取款成功：" + this.drawMoney);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //更新账户余额
                this.account.setBalance(this.account.getBalance() - this.drawMoney);
                System.out.println("\t 余额为：" + this.account.getBalance());
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足");
            }
        }
    }
}

public class TestDrawMoneyThread {
    public static void main(String[] args) {
        Account account = new Account("1234",1000);
        new Thread(new DrawThread(account,800),"p1").start();
        new Thread(new DrawThread(account,800),"p2").start();
    }
}
