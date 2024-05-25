package Binary_Search_Tree;

import java.util.ArrayList;

public class Part2 {
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

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int[] arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=createBST(arr,start,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }

    public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }

    public static Node createBST2(ArrayList<Integer> inorder,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBST2(inorder,start,mid-1);
        root.right=createBST2(inorder,mid+1,end);
        return root;
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        root=createBST2(inorder,0,inorder.size()-1);
        return root;
    }




    public static void main(String[] args) {
        int[] arr={3,5,6,8,10,11,12};
        Node root= createBST(arr,0,arr.length-1);
        preorder(root);
        System.out.println();

        Node root2=new Node(8);
        root2.left=new Node(6);
        root2.left.left=new Node(5);
        root2.left.left.left=new Node(3);
        root2.right=new Node(10);
        root2.right.right=new Node(11);
        root2.right.right.right=new Node(12);
        root2=balanceBST(root2);
        preorder(root2);
    }
}
