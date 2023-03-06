package JAVA基础深化和提高.容器;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();
        //添加元素
        boolean flag1 = list.add("oldlu");
        boolean flag2 = list.add("baizhan");
        boolean flag3 = list.add("12");
        boolean flag4 = list.add("12");
        boolean flag5 = list.add("shang");
        System.out.println(flag1+"\t"+flag2+"\t"+flag3+"\t"+flag4+"\t"+flag5);

        //如何将ArrayList转换成数组
        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        //删除元素
        boolean r = list.remove("12");
        System.out.println(r);
        Object[] objects1 = list.toArray();
        System.out.println(Arrays.toString(objects1));

        //获取元素个数
        int size = list.size();
        System.out.println(size);

        //判断容器是否为空
        boolean empty = list.isEmpty();
        System.out.println(empty);

        //判断容器是否包含指定元素
        boolean contains = list.contains("12");
        System.out.println(contains);

        //清空容器
        list.clear();

    }
}
