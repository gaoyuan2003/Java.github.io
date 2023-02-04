package JAVA快速入门.封装;

/**
 * JavaBean的封装演示
 */
public class Test01 {
    //属性一般使用private修饰
    private String name;
    private int age;
    private boolean flag;
    //为属性提供public修饰的set/get方法
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
