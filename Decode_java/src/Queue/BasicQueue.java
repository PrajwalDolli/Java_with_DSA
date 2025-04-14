package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q1=new ArrayDeque<>(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q1.add(q.remove());
        }

        System.out.println(q);
        for(int i=0;i<n;i++){
            q.add(q1.remove());
        }
        System.out.println(q);
    }
}
