package JAVA基础深化和提高.容器;

public class LinkedListTest {
    //LinkedList底层用双向链表实现存储，特点：查询效率低，增删效率高，线程不安全。
    //双向链表也叫双链表，每个数据节点都有两个指针，分别指向前一个节点和后一个节点
    //每个节点应该有的3部分内容
    class Node<E> {
        Node<E> previous;  //前一个节点
        E  element;      //本节点保存的数据
        Node<E> next;    //后一个节点
    }

    /**
     * 如何选用ArrayList,LinkedList,Vector?
     * 1.需要线程安全时，用Vector
     * 2.不存在线程安全时，并且查找较多用ArrayList（一般使用它）
     * 3.不存在线程安全问题时，增加或删除元素较多用LinkedList
     */
}
