package BinaryTree.Tutorial;

import java.util.Scanner;

public class BT {
    private static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("enter the root node value:");
        int value= scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner , Node node){
        System.out.println("do you want to enter left of " + node.data);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of" + node.data);
            int value= scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("do you want to enter right of " + node.data);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter the value of the right of"+node.data);
            int value= scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(this.root," ");
    }

    private void display(Node node, String indent) {
        if(node==null){
            return;
        }
        System.out.println(indent+node.data);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.println("|\t\t");
            }
            System.out.println("|------->"+node.data);
        }else{
            System.out.println(node.data);
        }
        prettyDisplay(node.left,level+1);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BT b=new BT();
        b.populate(scanner);
        b.prettyDisplay();
    }
}
