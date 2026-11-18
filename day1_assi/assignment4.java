import java.util.Scanner;
import java.util.Stack;

public class assignment4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<String> student = new Stack<>();
        int option;
        boolean working=true;
while(working){
        System.out.println("1.Enroll Learner");
        System.out.println("2.Undo last Learner");
        System.out.println("3.Show Last member");
        System.out.println("4.Exit");
    System.out.println("Enter your option ");
        option=s.nextInt();
switch(option){
    case 1:
        System.out.println("Enter student name");
        String name=s.next();
        student.push(name);
        System.out.println("Student Enrolled successfully");
        break;
    case 2:
        if(student.isEmpty()){
            System.out.println("Nothing to enroll");
        }
        else{
            System.out.println(student.pop() +" is removed");
        }
        break;
    case 3:
        if(student.isEmpty()){
            System.out.println("Nothing to display");
        }
        else{
            System.out.println(student.peek());
        }
        break;
    case 4:
        working=false;
        System.out.println("Thank you !!!!");
        break;
    default:
        System.out.println("Invalid option");
        break;

    }
    }

}}
