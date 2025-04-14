package Queue;

public class ArrayImplementation {
    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            else if(f==-1){
                f=0;
                r=0;
                arr[r]=val;
            }
            else{
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q=new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println(q.isEmpty());
        q.remove();
        q.display();
        System.out.println(q.peek());

    }
}
