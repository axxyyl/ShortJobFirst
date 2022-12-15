package my.exercises.shortjob;

public class MyQueueLinked {

    private Node head;
    public Node tail;
    private int count;

    public boolean isFull(){return false;}
    public boolean isEmpty(){return count == 0;}

    public boolean enqueue(Object item){
        Node node = new Node(item);

        if(isEmpty())
            head  = node;
        else
            tail.setNext(node);
        tail= node;
        count++;
        return true;
    }
    public Object peek(){return !isEmpty() ? head.getItem() : null;}
    public Object dequeue(){

        Object item = peek();
        if(item != null){
            head = head.getNext();
            count--;
        }
        return item;
    }
    public void clear(){
        for(; !isEmpty(); dequeue());
    }
    public int size(){return count;}
    public String toString(){
        StringBuffer sb = new StringBuffer();

        for(Node node = head; node!= null; node= node.getNext()){
            sb.append(node.getItem());
        }


        return sb.toString();
    }
    public static void main(String... args){
        MyQueueLinked q = new MyQueueLinked();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.print(q);
    }
}
