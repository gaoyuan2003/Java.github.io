package JAVA基础深化和提高.容器;

import java.util.ArrayList;
import java.util.List;

/**
 * 单例集合使用案例
 * 需求：
 * 产生1-10之间随机数[1,10]闭区间，将不重复的10个随机数放到容器中。
 */
    //使用List类型容器实现
public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        do {
            int num = (int) (Math.random() * 10 + 1);
            //判断当前元素在容器中是否存在
            if (!list.contains(num)) {
                list.add(num);
            }

            //结束循环
        } while (list.size() != 10);

        for(Integer i:list){
            System.out.println(i);
        }

    }
}
