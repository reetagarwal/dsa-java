package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            //a node will be returned here that is the root
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }

        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    } else{
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            return Math.max(lh,rh)+1;
        }

        public static int countNodes(Node root){
            if(root==null){
                return 0;
            }
            int lc=countNodes(root.left);
            int rc=countNodes(root.right);
            return lc+rc+1;
        }

        public static int Sum(Node root){
            if(root==null){
                return 0;
            }
            int ls=Sum(root.left);
            int rs=Sum(root.right);
            return ls+rs+root.data;
        }


        public static int leafNodes(Node root){
            if(root==null){
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            else {
                return leafNodes(root.left) + leafNodes(root.right);
            }
        }

        public static int diameter(Node root){//o(n^2)
            if(root==null){
                return 0;
            }
            int ldiam=diameter(root.left);
            int lheight=height(root.left);
            int rdiam=diameter(root.right);
            int rheight=height(root.right);
            int selfdiam=lheight+rheight+1;
            return Math.max(selfdiam,Math.max(ldiam,rdiam));
        }

        static class Info{
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }
        public static Info diameter2(Node root){
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter2(root.left);
            Info rightInfo=diameter2(root.right);

            int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(diam,ht);
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);

        System.out.println(root.data);

        tree.preorder(root);
        System.out.println();

        tree.inorder(root);
        System.out.println();

        tree.postorder(root);
        System.out.println();

        tree.levelOrder(root);
        System.out.println();

        System.out.println(tree.height(root));

        System.out.println(tree.countNodes(root));

        System.out.println(tree.Sum(root));

        System.out.println(tree.leafNodes(root));

        System.out.println(tree.diameter(root));

        System.out.println(tree.diameter2(root).diam);

    }
}
