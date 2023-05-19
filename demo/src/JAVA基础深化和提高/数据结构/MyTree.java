package JAVA基础深化和提高.数据结构;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTree<E> {
    private Map<E,E> map = new HashMap<>();//完成String--->String
    private Map<E,List<E>> map2 = new HashMap<>();//String--->List


    /**
     * 添加元素方法
     */
    public void add(E parent,E item){
        //单节点映射
        this.map.put(item,parent);
        //完成多节点之间的映射
        List<E> list = this.map2.computeIfAbsent(parent, k -> new ArrayList<>());
        //判断list是否为空
        list.add(item);
    }

    /**
     * 获取父节点
     */
    public E getParent(E item){
        return this.map.get(item);
    }

    /**
     * 获取子节点
     */
    public List<E> getChild(E item){
        return this.map2.get(item);
    }

    /**
     * 获取兄弟节点
     */
    public List<E> getBrother(E item){
        //获取当前结点的父节点
        E parent = this.getParent(item);
        //获取子节点
        List<E> list = this.getChild(parent);
        List<E> brother = new ArrayList<>();
        if(list != null){
            brother.addAll(list);
            brother.remove(item);
        }
        return brother;
    }

    /**
     * 获取祖先节点
     */
    public List<E> getForefathers(E item){
        //获取父节点
        E parent = this.getParent(item);
        if(parent == null){
            return new ArrayList<>();
        }
        //递归调用，获取父节点的父节点
        List<E> list = this.getForefathers(parent);
        //将递归到的所有节点元素添加到返回的List中
        list.add(parent);
        return list;
    }

    /**
     * 获取子孙结点
     */
    public List<E> getGrandChildren(E item){
        //存放所有子孙节点中的元素
        List<E> list = new ArrayList<>();
        //获取当前节点的子节点
        List<E> child = this.getChild(item);
        //结束递归条件
        if(child == null){
            return list;
        }
        //遍历子节点
        for (E ele : child) {
            //获取结点中的元素
            List<E> temp = this.getGrandChildren(ele);
            list.add(ele);
            list.addAll(temp);
        }
        return list;
    }


    public static void main(String[] args) {
        //实例化容器
        MyTree<String> myTree = new MyTree<>();
        myTree.add("root","生物");
        myTree.add("生物","植物");
        myTree.add("生物","动物");
        myTree.add("生物","菌类");
        myTree.add("动物","脊椎动物");
        myTree.add("动物","脊索动物");
        myTree.add("动物","腔肠动物");
        myTree.add("脊椎动物","哺乳动物");
        myTree.add("脊椎动物","鱼类");
        myTree.add("哺乳动物","人");
        myTree.add("哺乳动物","猫");
        myTree.add("哺乳动物","牛");
        System.out.println(myTree.getParent("鱼类"));
        System.out.println("----------------");
        System.out.println(myTree.getChild("动物"));
        System.out.println("----------------");
        System.out.println(myTree.getBrother("脊椎动物"));
        System.out.println("----------------");
        System.out.println(myTree.getForefathers("人"));
        System.out.println("----------------");
        System.out.println(myTree.getGrandChildren("root"));
    }
}
