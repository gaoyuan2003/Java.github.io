package 重写equals;

public class Test01 {
    public static void main(String[] args) {
        Person p1=new Person(123,"gaoqi");
        Person p2=new Person(123,"gaoxiaoqi");
        System.out.println(p1==p2);//false,不是同一个对象
        System.out.println(p1.equals(p2));//true
        String s1=new String("学校");
        String s2=new String("学校");
        System.out.println(s1==s2);//false,两个字符串不是同一个对象
        System.out.println(s1.equals(s2));//true,内容相同
    }
}
class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }else{
            if(obj instanceof Person){
                Person c=(Person)obj;
                if(c.id==this.id){
                    return true;
                }
            }
        }
        return false;
    }
}