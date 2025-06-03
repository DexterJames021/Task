import java.util.Scanner;
import java.lang.StringBuilder.*;

public class StringBuilderChar {
    static void lengthOfStringBuilder(StringBuilder sb) {
        System.out.println("Length of the StringBuilder: " + sb.length());
    }

    static void firstCharacter(StringBuilder sb) {
        System.out.println("First character: " + sb.charAt(0));
    }

    static void lastCharacter(StringBuilder sb) {
        System.out.println("Last character: " + sb.charAt(sb.length() - 1));
    }

    static void occurrencesOfCharacter(StringBuilder sb, char ch) {
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + ch + "': " + count);
    }

    static void indexToindex(StringBuilder sb) {
        int start = 3, end = 6;

        if (start < 0 || end >= sb.length() || start > end) {
            System.out.println("Invalid indices for substring");
            return;
        }

        String substring = sb.substring(start, end + 1);
        System.out.println("Substring from index " + start + " to " + end + ": " + substring);
    }

    static void appendToStringBuilder(StringBuilder sb) {
        sb.append("123");
        System.out.println("appending: " + sb.toString());
    }

    static void insertToIndex(StringBuilder sb) {
        int index = 4;
        String strToInsert = "xyz";

        if (index < 0 || index > sb.length()) {
            System.out.println("Invalid index for insertion");
            return;
        }
        sb.insert(index, strToInsert);
        System.out.println("inserting '" + strToInsert + "' at index " + index + ": " + sb.toString());
    }

    static void deleteFromIndex(StringBuilder sb) {
        int start = 2, end = 4;

        sb.delete(start, end + 1);
        System.out.println("deleting from index " + start + " to " + end + ": " + sb.toString());
    }

    static void deleteLastCharacter(StringBuilder sb) {
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("deleting the last character: " + sb.toString());
    }

    static void reverseStringBuilder(StringBuilder sb) {
        sb.reverse();
        System.out.println("reversing: " + sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        
        lengthOfStringBuilder(sb);
        firstCharacter(sb);
        lastCharacter(sb);
        occurrencesOfCharacter(sb, 'a');
        indexToindex(sb);
        appendToStringBuilder(sb);        
        insertToIndex(sb);
        deleteFromIndex(sb);
        deleteLastCharacter(sb);
        reverseStringBuilder(sb);

        scanner.close();
    }
}
