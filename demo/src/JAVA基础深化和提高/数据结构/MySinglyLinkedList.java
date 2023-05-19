package JAVA基础深化和提高.数据结构;

public class MySinglyLinkedList<E> implements MyList<E> {
    /**
     * 单向链表的节点对象
     * @param <E>
     */
    class Node<E>{
        private E item;//存储元素
        private Node next;//存储下一个节点对象
        Node(E item,Node next){
            this.item = item;
            this.next = next;
        }
    }
    private Node head;//存放头节点
    private int size;//记录元素个数
    /**
     * 添加元素
     * @param element
     */
    @Override
    public void add(E element) {
        //创建节点
        Node<E> node = new Node<>(element,null);
        //找到尾节点
        Node tail = getTail();
        //节点的挂接
        if(tail == null){
            this.head = node;
        }else {
            tail.next = node;
        }
        //记录元素个数
        this.size++;
    }

    /**
     * 找尾节点
     * @return
     */
    private Node getTail(){
        //头节点是否存在
        if(this.head == null){
            return null;
        }
        //查找尾节点
        Node node = this.head;
        while(true){
            if(node.next == null) break;
            node = node.next;//移动指针，指向下一个节点
        }
        return node;
    }
    /**
     * 获取元素
     * @param index
     * @return
     */
    @Override
    public E get(int index) {
        //校验index的合法性
        this.checkIndex(index);
        //根据位置返回节点
        Node<E> node = this.getNode(index);
        //将该节点的元素返回
        return node.item;
    }
    /**
     * 根据位置获取节点
     */
    private Node getNode(int index){
        Node<E> node = this.head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    /**
     * 校验index
     */
    private void checkIndex(int index){
        if(!(index >= 0 && index < this.size)){
            throw new IndexOutOfBoundsException("Index: "+index+" Size: "+this.size);
        }
    }

    /**
     * 获取元素个数
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
        //校验index的合法性
        this.checkIndex(index);
        //找到节点对象
        Node<E> node = this.getNode(index);
        //获取该节点元素
        E item = node.item;
        //删除节点对象
            //判断是否为头节点
        if(this.head == node){
            this.head = node.next;
        }else{
            Node<E> temp = this.head;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = node.next;
        }
        node.next = null;
        //记录元素个数
        this.size--;
        //返回该元素
        return item;
    }

    public static void main(String[] args) {
        MySinglyLinkedList<String> mySinglyLinkedList = new MySinglyLinkedList<>();
        mySinglyLinkedList.add("a");
        mySinglyLinkedList.add("b");
        System.out.println(mySinglyLinkedList.size());
        System.out.println(mySinglyLinkedList.get(1));
        System.out.println(mySinglyLinkedList.remove(1));
        System.out.println(mySinglyLinkedList.get(1));
    }
}
