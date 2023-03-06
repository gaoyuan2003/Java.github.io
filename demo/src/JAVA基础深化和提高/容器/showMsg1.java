package JAVA基础深化和提高.容器;

public class showMsg1 {
    //通配符的上限限定
    public void showFlag1(Generic<? extends Number> generic){
        System.out.println(generic.getFlag());
    }
}
