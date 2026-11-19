public class ValidateBST {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean validateBST(Node root, Node min, Node max){
        if(root == null) return true;

        //For right subtree
        if(min != null && root.data <= min.data){
            return false;
        }
        
        //For left subtree
        if(max != null && root.data >= max.data){
            return false;
        }

        return validateBST(root.left, min, root) && validateBST(root.right, root, max);
    }
    public static void main(String[] args){
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        
        if(validateBST(root, null, null)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
