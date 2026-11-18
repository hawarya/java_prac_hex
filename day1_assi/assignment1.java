import java.util.*;

public class assignment1 {
    public static void main(String[] args) {
String [] arr={"Aishwarya","Amirtha","Gayathri","Maha"};
Queue<String> newstack =new ArrayDeque<>();
    for(int i=0;i<arr.length;i++){
        newstack.offer(arr[i]);
    }
    while(newstack.size()!=0){
        System.out.println( newstack.poll());
    }
    }
}