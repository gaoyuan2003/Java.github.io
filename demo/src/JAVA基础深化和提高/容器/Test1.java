package JAVA基础深化和提高.容器;

public class Test1 {
    public static void main(String[] args) {
        IGeneric<String> igenreic = new IGenericlmpl();
        String name = igenreic.getName("fdbl");
        System.out.println(name);

        IGeneric<String> igeneric1 = new IGenericlmpl2<>();
        String name1 = igeneric1.getName("1234");
        System.out.println(name1);
    }
}
