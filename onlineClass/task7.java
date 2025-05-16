package onlineClass;

import java.util.Scanner;


public class task7 {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First operand:");
        Integer number1 = input.nextInt();
        System.out.print("Second operand:");
        Integer number2 = input.nextInt();

        task7 t = new task7();

        System.out.println("add: "      + t.add(number1, number2));
        System.out.println("subtract: " + t.subtract(number1, number2));
        System.out.println("divide: "   + t.divide(number1, number2));
        System.out.println("multiply: " + t.multiply(number1, number2));

        input.close();
    }
}
