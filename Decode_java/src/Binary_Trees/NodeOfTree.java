package Binary_Trees;

public class NodeOfTree {
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(10);
        Node d=new Node(6);
        Node e=new Node(5);
        Node f=new Node(11);
        System.out.println(a.val);
        System.out.println(a.left);
        System.out.println(a.right);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;e.val=0;
        System.out.println(a.left.right.val);
        display(a);
        System.out.println();

        System.out.println(sum(a));
        System.out.println(mul(a));
        System.out.println(maxValue(a));
        System.out.println(minValue(a));
        System.out.println(size(a));
        System.out.println(levels(a));
    }
    public static int levels(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(levels(root.left),levels(root.right));
    }

    public static int size(Node root){
        if(root==null){
            return  0;
        }
        return 1+size(root.left)+size(root.right);
    }
    public static int minValue(Node root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int a= root.val;
        int b=minValue(root.left);
        int c=minValue(root.right);
        return Math.min(a,Math.min(b,c));
    }

    public static int maxValue(Node root){
       if(root==null){
           return Integer.MIN_VALUE;
       }
       int a=root.val;
       int b=maxValue(root.left);
       int c=maxValue(root.right);
       return Math.max(a,Math.max(b,c));
    }
    public static int mul(Node root){
        if(root == null || root.val==0){
            return 1;
        }
        return root.val*mul(root.left)*mul(root.right);
    }
//    public static int sum(Node root){
//        if(root==null){
//            return 0;
//        }
//        return root.val+sum(root.left)+sum(root.right);
//    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int a=sum(root.left);
        int b=sum(root.right);
        return root.val+a+b;
    }
    private static void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
}
