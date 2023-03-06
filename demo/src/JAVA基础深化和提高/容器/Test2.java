package JAVA基础深化和提高.容器;

import java.awt.*;

public class Test2 {
    public static void main(String[] args) {
        ShowMsg showMsg = new ShowMsg();
        Generic<Integer> generic = new Generic<>();
        generic.setFlag(20);
        showMsg.showFlag(generic);

        Generic<Number> generic1 = new Generic<>();
        generic1.setFlag(78);
        showMsg.showFlag(generic1);
    }
}
