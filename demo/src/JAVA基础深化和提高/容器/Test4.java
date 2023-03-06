package JAVA基础深化和提高.容器;

public class Test4 {
    public static void main(String[] args) {
        showMsg1 showMsg1 = new showMsg1();
        Generic<Integer> generic = new Generic<>();
        generic.setFlag(678);
        showMsg1.showFlag1(generic);

        Generic<Number> generic1 = new Generic<>();
        generic1.setFlag(98);
        showMsg1.showFlag1(generic1);
    }
}
