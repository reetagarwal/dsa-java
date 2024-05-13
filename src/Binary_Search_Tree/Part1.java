package Binary_Search_Tree;

import java.security.PublicKey;
import java.util.ArrayList;

public class Part1 {
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

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else {
            root.right=insert(root.right,val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left,key);
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return false;
    }
    public static Node search2(Node root,int key){
        if(root==null || root.data==key){
            return root;
        }
        if(root.data>key){
            return search2(root.left,key);
        }
        return search2(root.right,key);
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node delete(Node root,int key){
        if(root==null){
            return root;
        }

        //searching for the key
        if(root.data<key){
            root.right=delete(root.right,key);
        } else if (root.data>key) {
            root.left=delete(root.left,key);
        }

        else{
            //case-1:leaf node deletion
            if(root.left==null&& root.right==null){
                return null;
            }

            //case-2:single child deletion
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }

            //case3-both children deletion
            Node IS=findInorderSuccessor(root.right);
            root.data= IS.data;
            root.right=delete(root.right, IS.data);
        }
        return root;
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data);
            printInRange(root.right,k1,k2);
        } else if (root.data<k1) {
            printInRange(root.left,k1,k2);
        }
        else
            printInRange(root.right,k1,k2);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){//leaf node
            printPath(path);
        }
        printRootToLeaf(root.left,path);
        printRootToLeaf(root.right,path);
        path.remove(path.size()-1);
    }

    public static boolean validBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        } else if (max!=null && root.data>= max.data) {
            return false;
        }
        return validBST(root.left,min,root)
            && validBST(root.right,root,max);
    }

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);
        root.left=rightS;
        root.right=leftS;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }



    public static void main(String[] args) {
        int[] values={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        System.out.println(search(root,8));
        int key=4;
        if(search2(root,key)==null)
            System.out.println(key+" not found ");
        else
            System.out.println(key+" found ");

        root=delete(root,2);
        inorder(root);
        System.out.println();

        printInRange(root,4,7);
        System.out.println();

        printRootToLeaf(root,new ArrayList<>());

        System.out.println(validBST(root,null,null));

        root=mirror(root);
        preorder(root);
    }
}
