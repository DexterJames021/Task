import java.util.Scanner;

public class StringMethods {
    static void lengthOfString(String str) {
        System.out.println("Length of the string: " + str.length());
    }

    static void toUpperCase(String str) {
        System.out.println("String in uppercase: " + str.toUpperCase());
    }

    static void toLowerCase(String str) {
        System.out.println("String in lowercase: " + str.toLowerCase());
    }

    static void charAtFirst(String str) {
        System.out.println("First character " + ": " + str.charAt(0));
    }

    static void charAtLast(String str) {
        System.out.println("Last character " + ": " + str.charAt(str.length() - 1));
    }

    static void substring(String str) {
        int start = 1;
        int end = 5;

        System.out.println("Substring from 2nd to 5th char " + str + ": " + str.substring(start, end));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        lengthOfString(input);
        toUpperCase(input);
        toLowerCase(input);
        charAtFirst(input);
        charAtLast(input);
        substring(input);

        scanner.close();

    }
}
