package JAVA基础深化和提高.容器;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {
        //实例化ArrayList容器
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("oldlu");
        list.add("123");
        //指定位置添加元素,索引数不大于元素个数
        list.add(0,"0");
        list.add(3,"3");
        list.add(1,"23");
        list.add(2,"123");

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

        //获取元素
        System.out.println("获取元素");
        String s = list.get(1);
        System.out.println(s);
        //一次性获取所有元素
        //使用普通for循环
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //for...each遍历
        for(String e:list){
            System.out.println(e);
        }

        //元素的替换
        String k = list.set(1, "kevin");
        System.out.println(k);

        //元素删除
        String r = list.remove(1);
        System.out.println(r);

        for(String str:list){
            System.out.println(str);
        }

        //查找元素出现位置
        int i = list.indexOf("123");//第一次出现
        System.out.println(i);
        int i1 = list.lastIndexOf("123");
        System.out.println(i1);
    }
}
