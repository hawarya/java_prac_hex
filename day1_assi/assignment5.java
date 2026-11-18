
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        String[] batch= new String[3];
        Queue<String> waitlist=new ArrayDeque<>();
        Scanner s=new Scanner(System.in);
        String[] learners = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};
        for(int i=0;i<learners.length;i++){
            boolean seated=false;
            for(int j=0;j<batch.length;j++){
                if(batch[j]==null){
                    batch[j]=learners[i];
                    seated = true;
                    break;
                }
            }
            if(!seated){
                waitlist.offer(learners[i]);
            }
            System.out.println("Joined: " + learners[i]);
            System.out.println("Seats: " + Arrays.toString(batch));
            System.out.println("Waiting: " + waitlist);
        }

        System.out.print("Enter learner name who drops out: ");
        String dropped = s.nextLine();

        boolean found = false;
        for (int i = 0; i < batch.length; i++) {

            if (dropped.equalsIgnoreCase(batch[i])) {

                found = true;


                batch[i] = null;


                if (!waitlist.isEmpty()) {

                    String nextLearner = waitlist.poll();

                    batch[i] = nextLearner;

                    System.out.println(nextLearner + " gets the vacant seat.");
                } else {
                    System.out.println("No one is waiting.");
                }

                break;
            }
        }

        if (!found) {
            System.out.println("Learner not found in the batch.");
        }


        System.out.println("Final Seats: " + Arrays.toString(batch));
        System.out.println("Final Waiting List: " + waitlist);

    }
}
