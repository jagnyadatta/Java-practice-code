public class SearchInBST {
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

    public static boolean search(Node root, int val){
        if(root == null) return false;

        if(root.data == val) return true;

        if(root.data > val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }

    public static void main(String[] args){
        int values[] = {6, 2, 9, 1, 4, 7, 10, 3, 5, 8};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        if(search(root, 7)){
            System.out.println("Found the node");
        }else{
            System.out.println("Not Found!");
        }
    }
}
