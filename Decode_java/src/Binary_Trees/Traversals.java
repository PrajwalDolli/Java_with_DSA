package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        preOrder(a);
        System.out.println();
        inOrder(a);
        System.out.println();
        postOrder(a);
        System.out.println();
        System.out.print("level order ");
        levelOrder(a);


    }
    public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        System.out.println();
    }
    private static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }
    private static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }


}

