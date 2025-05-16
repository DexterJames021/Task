package tasks.task113;

public class Task113 {

    public static void main(String[] args) {
        int number = 10;
    
        for(int i = 0; i < number; i++){
            String message = (i % 2 == 0)? "Even": "Odd";
            System.out.println(i + " is "+ message + " number");
        }
    }
}