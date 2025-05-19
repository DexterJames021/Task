package programmingChallenge;

import java.util.Scanner;

public class NumberToMonth {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = scan.nextInt();

        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("Invalid month number.");
                scan.close();
                return;
        }

        System.out.println("Number of days: " + days);
        scan.close();
    }
}
