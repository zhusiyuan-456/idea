import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BST<E extends Comparable<E>> {
    private class Node {
        public E value;
        public Node left, right;

        public Node(E value) {
            this.value = value;
            left = null;
            right = null;
        }

    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    //add
    public void add(E element) {
        root = add(root, element);
    }
    //向以node为根的二叉树中添加e
    //返回插入新节点后二叉树的根
    //null也可以是二叉树的根

    private Node add(Node node, E element) {
        if (node == null) {
            size++;
            return new Node(element);
        }

        if (element.compareTo(node.value) < 0) {
            node.left = add(node.left, element);
        } else if (element.compareTo(node.value) > 0) {
            node.right = add(node.right, element);
        }
        return node;
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {
        if (node == null)
            return false;
        if (e.compareTo(node.value) == 0)
            return true;
        else if (e.compareTo(node.value) < 0) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        GenerateBSTString(root, 0, s);
        return s.toString();
    }

    private void GenerateBSTString(Node node, int depth, StringBuilder s) {
        if (node == null) {
            s.append(GenerateDepthString(depth) + "null\n");
            return;
        }
        s.append(GenerateDepthString(depth) + node.value + "\n");
        GenerateBSTString(node.left, depth + 1, s);
        GenerateBSTString(node.right, depth + 1, s);
    }

    private String GenerateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node cur = queue.remove();
            System.out.println(cur.value);

            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
        }
    }

    public E minimum() {
        if (size == 0) throw new IllegalArgumentException("tree is empty");

        return minimum(root).value;
    }

    private Node minimum(Node node) {
        if (node.left == null) return node;
        return minimum(node.left);
    }

    public E maximum() {
        if (size == 0) throw new IllegalArgumentException("tree is empty");
        return maximum(root).value;
    }

    private Node maximum(Node node) {
        if (node.right == null) return node;
        return maximum(node.right);
    }

    public E removeMin() {
        E ret = minimum();
        removeMin(root);
        return ret;
    }

    //删除掉以node为根的二叉树的最小值
    //返回删除节点后新的二分搜索树的根
    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    public E removeMax() {
        E ret = maximum();
        removeMax(root);
        return ret;
    }

    //删除掉以node为根的二叉树的最小值
    //返回删除节点后新的二分搜索树的根
    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    public void remove(E e) {
        root = remove(root, e);
    }

    private Node remove(Node node, E e) {
        if (node == null)
            return null;
        if (e.compareTo(node.value) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else if (e.compareTo(node.value) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;

            return successor;
        }
    }


    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
//        int[] num = {5, 3, 6, 8, 4, 2};
//        for (int nums : num) {
//            bst.add(nums);
//        }
//        bst.preOrder();
//        System.out.println(bst);
//        bst.levelOrder();
//        System.out.println(bst.minimum());
        Random random = new Random();
        int n = 10;
        for (int i = 0; i < n; i++)
            bst.add(random.nextInt(10));
        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty()) {
            nums.add(bst.removeMin());
        }
        System.out.println(nums);

    }

}
