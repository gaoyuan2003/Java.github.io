package JAVA基础深化和提高.容器;

public class ShowMsg {
    //输出Generic对象中的flag值,使用通配符<?>
    public void showFlag(Generic<?> generic){
        System.out.println(generic.getFlag());

    }
}
