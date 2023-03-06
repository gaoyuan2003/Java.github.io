package JAVA基础深化和提高.容器;

import java.util.List;
import java.util.Vector;

public class VectorTest {
    //相关方法增加同步检查，因此“线程安全，效率低”，增加synchronized同步标记
    public static void main(String[] args) {
        //实例化Vector
        List<String> v = new Vector<>();

        //添加元素
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("3");
        //System.out.println(v);
        //遍历
        for(String str:v){
            System.out.println(str);
        }

        //获取指定元素
        String s = v.get(0);
        System.out.println(s);
    }
}
