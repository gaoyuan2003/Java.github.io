package JAVA基础深化和提高.数据结构;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 自定义栈容器
 */

public class MyStack<E> {

    private Object[] arr;//存放元素的数组结构
    private int stackLength = 4;//数组的长度
    private int size;//记录栈容器的元素个数
    private int index = -1;//操作数组下标位置的指针



    /**
     * 判断栈容器是否为空
     * @return
     */
    public boolean empty(){
        return this.size == 0;
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public E pop(){
        //如果栈容器中没有元素则抛出异常
        if(this.index == -1){
            throw new EmptyStackException();
        }
        //记录元素个数
        this.size--;
        //返回栈顶元素
        return (E)this.arr[index--];
    }

    /**
     * 向栈容器中添加元素
     * @param item
     * @return
     */
    public E push(E item){
        //初始化数组
        this.capacity();
        //向数组中添加元素
        this.arr[++index] = item;
        //记录元素个数
        this.size++;
        return item;
    }

    /**
     * 数组初始化或者以1.5倍容量对数组扩容
     */
    private void capacity(){
        //数组初始化
        if(this.arr == null){
            this.arr = new Object[this.stackLength];
        }
        //数组扩容
        if(this.size - (this.stackLength-1) >= 0){
            this.stackLength = this.stackLength + (this.stackLength >> 1);
            this.arr = Arrays.copyOf(this.arr,this.stackLength);
        }
    }

    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");
        myStack.push("d");
        System.out.println(myStack.size);
        System.out.println(myStack.pop());
    }
}
