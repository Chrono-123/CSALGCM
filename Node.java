public class Node{
    int val;
    int left;
    int right;
    int color;

    public void Node(int val, int left, int right, int color){
        this.val = val;
        this.left = left;
        this.right = right;
        this.color = color;
    }

    public void setVal(int val){
        this.val = val;
    }

    public int getVal(){
        return val;
    }

    public void setLeft(int left){
        this.left = left;
    }

    public int getLeft(){
        return left;
    }
    
    public void setRight(int right){
        this.right = right;
    }

    public int getRight(){
        return right;
    }

    public void setColor(int color){
        this.color = color;
    }

    public int getColor(){
        return color;
    }
}