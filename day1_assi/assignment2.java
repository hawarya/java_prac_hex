import java.util.LinkedList;
import java.util.Queue;

public class assignment2 {
    public static void main(String[] args) {
        Queue<String> linkedlist =new LinkedList<>();
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        while(linkedlist.size()!=0){
            System.out.println(linkedlist.poll());
        }
    }
}
