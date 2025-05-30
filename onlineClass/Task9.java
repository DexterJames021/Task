package onlineClass;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task9 {
    public static int add(int x, int y) {
        return addExact(x, y);
    }

    public static int subtract(int x, int y) {
        return subtractExact(x, y);
    }

    public static float divide(int x, int y) {
        return floorDiv(x, y);
    }

    public static int multiply(int x, int y) {
        return multiplyExact(x, y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First operand:");
        Integer number1 = input.nextInt();
        System.out.print("Second operand:");
        Integer number2 = input.nextInt();

        // task7 t = new task7();

        System.out.println("add: " + add(number1, number2));
        System.out.println("subtract: " + subtract(number1, number2));
        System.out.println("divide: " + divide(number1, number2));
        System.out.println("multiply: " + multiply(number1, number2));

        input.close();
    }
}
