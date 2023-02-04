package 构造方法重载;

public class User {
    int id;
    String name;
    String pwd;
    public User(){}
    public User(int id,String name){
        this.id=id;
        this.name=name;
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User(101,"小宝");
        User u3=new User(100,"小张","12345");
    }
}
