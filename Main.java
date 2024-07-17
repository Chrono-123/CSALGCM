public class Main{
    
    public static void main(String[] args){
        int root = 7;
        Node node1 = new Node(root);
        node1.setLeft(6);
        node1.setRight(10);
        Node node2 = new Node(node1.getLeft());
        node2.setLeft(5);
        node2.setRight(8);
        Node node3 = new Node(node2.getLeft());
        Node node4 = new Node(node2.getRight());
        Node node5 = new Node(node1.getRight());
        node5.setLeft(9);
        node5.setRight(11);
        Node node6 = new Node(node5.getLeft());
        Node node7 = new Node(node5.getRight());
        
        
    }
}
