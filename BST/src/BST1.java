public class BST1 {
    private class Node {
        public int v;
        public Node left, right;

        public Node(int v) {
            this.v = v;
            left = null;
            right = null;
        }
    }

    private Node root;
    int size;

    public BST1(int v) {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int v) {
        root = add(root, v);
    }

    private Node add(Node node, int v) {
        if (node == null) {
            size++;
            return  new Node(v);
        }
        if (v>node.v){
            node.right=add(node.right,v);
        }
        else if (v<node.v){
            node.left=add(node.left,v);
        }
        return node;
    }

    public  boolean contain(int e){
       return contain(root,e);
    }
    private boolean contain(Node node, int e){
        if (node==null){
            return false;
        }
        if (e==node.v) return true;
        else if (e<node.v){
          return  contain(node.left,e);
        }else{
            return contain(node.right,e);
        }
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node==null)return;
        System.out.println(node.v);
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if (node==null) return;
        inOrder(node.left);
        System.out.println(node.v);
        inOrder(node.right);
    }


}
