package onlineClass; 
import java.util.Scanner;

public class task4 {
    // task 4
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String str = word.nextLine();
        boolean isPalindrome = new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        System.out.println(isPalindrome ? "Palindrome!" : "Not a palindrome");
        word.close();
    }
}
