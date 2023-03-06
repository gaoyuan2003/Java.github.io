package JAVA基础深化和提高.容器;

public class Test {
    public static void main(String[] args) {
        //创建对象时，指定泛型具体类型
        Generic<String> generic = new Generic<>();
        generic.setFlag("admin");
        String flag = generic.getFlag();
        System.out.println(flag);

        //创建对象时，指定泛型具体类型
        Generic<Integer> generic1 = new Generic<>();
        generic1.setFlag(100);
        Integer flag1 = generic1.getFlag();
        System.out.println(flag1);
    }
}
