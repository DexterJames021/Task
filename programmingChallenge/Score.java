package programmingChallenge;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");

        switch (scanner.nextInt()) {
            case 90:
                System.out.println("You got an A");
                break;
            case 80:
            case 89:
                System.out.println("You got an B");
                break;
            case 70:
            case 79:
                System.out.println("You got an C");
                break;
            case 60:
            case 69:
                System.out.println("You got an D");
                break;
            default:
                System.out.println("You got an F");
                break;
        }

        scanner.close();
    }
}
