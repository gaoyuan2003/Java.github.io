package JAVA基础深化和提高.数据结构;

public class BinaryTreeSort<E extends Integer> {
    /**
     * 定义节点类
     */
    class Node<E extends Integer>{
        private E item;//存放元素
        private Node left;//存放左子树地址
        private Node right;//存放右子树地址

        Node(E item) {
            this.item = item;
        }

        /**
         * 添加节点
         */
        private void addNode(Node node){
            //判断新节点中的元素与当前节点的大小
            //如果新节点中的元素小于当前节点元素，就放在左子树中
            if(node.item.intValue() < this.item.intValue()){
                if(this.left == null) this.left = node;
                else this.left.addNode(node);
            }else{
                //大于就放在右子树
                if(this.right == null) this.right = node;
                else this.right.addNode(node);
            }
        }
        /**
         * 遍历节点方法
         */
        public void inorderTraversal(){
            //找到最左侧的节点
            if(this.left != null) this.left.inorderTraversal();
            System.out.println(this.item);
            if(this.right != null) this.right.inorderTraversal();
        }
    }
    private Node root;//存放树的根节点的地址
    /**
     * 将元素添加到排序器中
     */
    public void add(E element){
        //实例化节点对象
        Node<E> node = new Node<>(element);
        //判断当前二叉树中是否有根节点，如果没有根节点则为根节点
        if(this.root == null)
            this.root = node;
        else
            this.root.addNode(node);
    }
    /**
     * 对元素进行排序
     */
    public void sort(){
        //判断根节点是否为空
        if(this.root == null){
            return;
        }else{
            this.root.inorderTraversal();
        }
    }

    public static void main(String[] args) {
        BinaryTreeSort<Integer> binaryTreeSort = new BinaryTreeSort<>();
        binaryTreeSort.add(1);
        binaryTreeSort.add(8);
        binaryTreeSort.add(6);
        binaryTreeSort.add(3);
        binaryTreeSort.add(5);
        binaryTreeSort.add(2);
        binaryTreeSort.sort();
    }
}
