package JAVA基础深化和提高.容器;

import java.util.LinkedList;


public class LinkedListTest2 {
    public static void main(String[] args) {
        //非List标准
        //实例化LinkedList容器
        LinkedList<String> list = new LinkedList<>();
        //添加元素
        list.addFirst("0");
        list.addFirst("1");
        //System.out.println(list);
        for(String str:list){
            System.out.println(str);
        }

        System.out.println("-----------");

        //将指定元素添加到末尾
        LinkedList<Integer> i = new LinkedList<>();
        i.addLast(1);
        i.addLast(2);
        i.addLast(3);
        for(Integer str:i){
            System.out.println(str);
        }

        //返回第一个元素
        System.out.println("返回值");
        Integer str = i.getFirst();
        System.out.println(str);  //返回1
        //返回最后一个元素
        System.out.println(i.getLast());//返回3

        System.out.println("------------");

        //移除最后一个元素并返回这个元素
        int e = 1;
        i.push(e);
        Integer pop = i.pop();
        Integer integer1 = i.removeLast();
        System.out.println(i);

    }


}
