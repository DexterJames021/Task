// package onlineClass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * chech which number is the largest in 3 inputs.
 */
public class task5 {
    static ArrayList<Integer> store = new ArrayList<>();

    static int getLargerInt() {
        int maxim = store.get(0);

        for (int i = 1; i < store.size(); i++) {
            if (store.get(i) > maxim) {
                maxim = store.get(i);
            }
        }

        return maxim;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++) {
            store.add(scan.nextInt());
        }

        // store.add(1);
        // store.add(110);
        // store.add(1000);

        int largest = getLargerInt();
        System.out.println("Largest number is: " + largest);
        scan.close();
    }
}
