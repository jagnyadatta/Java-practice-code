public class BuildTreePreOrder {
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
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
        //PRE-ORDER TREE PRINT
        public void preOrder(Node root){
            if(root == null){
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //IN-ORDER TREE PRINT
        public void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        //POST-ORDER TREE PRINT
        public void postOrder(Node root){
            if(root==null) return;
            postOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data + " ");
        }
        //HEIGHT OF TREE
        public int height(Node root){
            if(root == null) return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1; 
        }
        //COUNT NODES
        public int countNodes(Node root){
            if(root == null) return 0;
            int lc = countNodes(root.left);
            int rc = countNodes(root.right);
            return lc + rc + 1;
        }
        //FIND DIAMETER
        public int diameter_nSquare(Node root){   //O(N^2)
            if(root == null) return 0;
            int ldiam = diameter_nSquare(root.left);
            int rdiam = diameter_nSquare(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int selfdiam = lh + rh + 1;
            return Math.max(selfdiam, Math.max(ldiam, rdiam));
        }

        //Static class for storing info
        public static class Info{
            int diam;
            int ht;
            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }

        //DIAMETER FUNCTION IN === O(N)
        public Info diameter(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);
            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int height = Math.max(leftInfo.ht, rightInfo.ht) + 1;
            return new Info(diam, height);
        }
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        System.out.println("Height of Tree: "+ tree.height(root));
        System.out.println();
        System.out.println("Total Nodes : "+ tree.countNodes(root));

        System.out.println();
        System.out.println("Diameter : "+ tree.diameter_nSquare(root));

        System.out.println();
        BuildTreePreOrder.BinaryTree.Info ans = tree.diameter(root);
        System.out.println("Diameter: "+ans.diam + " Height: "+ans.ht);
    }
}
