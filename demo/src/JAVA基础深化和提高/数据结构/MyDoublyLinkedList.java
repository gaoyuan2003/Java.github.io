package JAVA基础深化和提高.数据结构;

public class MyDoublyLinkedList<E> implements MyList<E> {

    private Node<E> tail;//尾节点
    private Node<E> head;//头节点
    private int size;//元素个数
    /**
     * 节点类
     */
    class Node<E>{
        E item;//记录元素
        Node<E> prev;//记录前一个节点
        Node<E> next;//记录后一个节点
        Node(Node<E> prev,E item,Node<E> next){
            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }
    /**
     * 添加元素
     * @param element
     */
    @Override
    public void add(E element) {
        this.linkLast(element);
    }
    /**
     * 添加节点对象到尾部
     */
    private void linkLast(E element){
        //获取尾节点
        Node t = this.tail;
        //创建新节点
        Node<E> node = new Node<>(t,element,null);
        //将新节点定义为尾节点
        this.tail = node;
        if(t == null){
            this.head = node;
        }else{
            t.next = node;
        }
        this.size++;
    }

    /**
     * 获取元素
     * @param index
     * @return
     */
    @Override
    public E get(int index) {
        this.checkIndex(index);
        Node<E> node = this.getNode(index);
        return node.item;
    }
/**
 * 校验index
 */
private void checkIndex(int index){
    if(!(index >= 0 && index < this.size)){
        throw new IndexOutOfBoundsException("Index: "+index+" Size: "+size);
    }
}
private Node getNode(int index){
    if(index <(this.size >> 1)){
        Node node = this.head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }else{
        Node node = this.tail;
        for(int i=this.size - 1;i>index;i--){
            node = node.prev;
        }
        return node;
    }
}
    /**
     * 元素个数
     * @return
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * 删除元素
     * @param index
     * @return
     */
    @Override
    public E remove(int index) {
        this.checkIndex(index);
        Node<E> node = this.getNode(index);
        //获取元素
        E item = node.item;
        if(node.prev == null){
            this.tail = node.next;
        }else{
            node.prev.next = node.next;
        }
        if(node.next == null){
            this.tail = node.prev;
        }else {
            node.next.prev = node.prev;
        }
        node.prev = null;
        node.next = null;
        node.item = null;
        this.size--;
        return item;
    }

    /**
     * 在链表头添加元素
     */
    public void addFirst(E element){
        this.LinkFirst(element);
    }

    private void LinkFirst(E element){
        Node head = this.head;
        Node node = new Node(null,element,head);
        this.head = node;
        if(head == null){
            this.tail = node;
        }else{
            head.prev = node;
        }
        this.size++;
    }

    public static void main(String[] args) {
        MyDoublyLinkedList<String> m = new MyDoublyLinkedList<>();
        m.add("a");
        m.add("b");
        m.add("d");
        m.add("c");
        System.out.println(m.size());
        System.out.println(m.get(3));
        System.out.println(m.remove(3));
        System.out.println(m.size());
        for(int i=0;i<m.size;i++){
            System.out.println(m.get(i));
        }
        System.out.println("------------");
        m.addFirst("pp");
        for(int i=0;i<m.size;i++){
            System.out.println(m.get(i));
        }
    }
}
