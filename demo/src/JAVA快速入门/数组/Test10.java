package 数组;

import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        Man1[] msMans={new Man1(3,"a"),new Man1(60,"b"),new Man1(2,"c")};
        Arrays.sort(msMans);
        System.out.println(Arrays.toString(msMans));
    }
}
class Man1 implements Comparable{
    int age;
    int id;
    String name;

    public Man1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
    public int compareTo(Object o){
        Man1 man=(Man1)o;
        if(this.age<man.age){
            return -1;
        }
        if(this.age>man.age){
            return 1;
        }
        return 0;
    }
}