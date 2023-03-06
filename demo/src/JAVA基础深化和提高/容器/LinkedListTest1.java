package JAVA基础深化和提高.容器;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest1 {
    public static void main(String[] args) {
        //List标准
        //实例化linkedList容器
        List<String> list = new LinkedList<>();
        //添加元素
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(4,"5");
        //System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));  //链表没有下标，节点从零开始
        }

    }
}
