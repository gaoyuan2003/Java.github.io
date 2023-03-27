package JAVA基础深化和提高.容器;


import java.util.HashSet;
import java.util.Set;

/**
 * 单例集合使用案例
 * 需求：
 * 产生1-10之间随机数[1,10]闭区间，将不重复的10个随机数放到容器中。
 */
//使用Set类型容器实现

public class SetDemo {
    public static void main(String[] args) {
        //实例化Set类型容器
        Set<Integer> set = new HashSet<>();

        do {
            int num = (int) (Math.random() * 10 + 1);
            set.add(num);
        } while (set.size() != 10);
        for (Integer i:set){
            System.out.println(i);
        }
    }
}
