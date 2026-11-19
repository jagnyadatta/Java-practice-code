import java.util.ArrayList;

public class RootToLeafPath {
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

    public static void findRootToLeafPath(Node root, ArrayList<Integer> list){
        if(root == null) return;

        list.add(root.data);

        if(root.left == null && root.right == null){
            printData(list);
        }
        
        findRootToLeafPath(root.left, list);
        findRootToLeafPath(root.right, list);
        
        list.remove(list.size()-1);
    }
    
    public static void printData(ArrayList<Integer> list){
        for(int n : list){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();

        findRootToLeafPath(root, list);
        
    }
}
