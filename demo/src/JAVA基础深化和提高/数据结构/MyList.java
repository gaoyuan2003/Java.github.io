package JAVA基础深化和提高.数据结构;

/**
 * 基于链表结构存储元素的API定义
 * @param <E>
 */
public interface MyList<E> {
    void add(E element);
    E get(int index);
    int size();
    E remove(int index);
}
