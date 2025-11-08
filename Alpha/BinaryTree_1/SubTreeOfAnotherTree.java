public class SubTreeOfAnotherTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //identical checking function
    public static boolean isIdentical(Node root, Node subTree){
        if(root == null && subTree == null){
            return true;
        }else if(root == null || subTree == null || root.data != subTree.data){
            return false;
        }
        if(!isIdentical(root.left, subTree.left)){
            return false;
        }
        if(!isIdentical(root.right, subTree.right)){
            return false;
        }
        return true;
    }
    //main checking function
    public static boolean isSubtree(Node root, Node subTree){
        if(root == null) return false;
        if(root.data == subTree.data){
            if(isIdentical(root, subTree)){
                return true;
            }
        }
        return isSubtree(root.left, subTree) || isSubtree(root.right, subTree);
    }
    public static void main(String[] args){
        /*
                  1
                /   \
               2     3
              / \    / \
             4   5  6   7
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                2
               / \
              4   5         
        */
        Node subTree = new Node(2);
        subTree.left = new Node(4);
        subTree.right = new Node(5);

        System.out.println(isSubtree(root, subTree));
    }
}
