package onlineClass;

import java.util.Scanner;


public class task7 {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static void computer(String operator, int number1, int number2) {
        switch (operator) {
            case "+":
                System.out.println("Addition: " + add(number1, number2));
                break;
            case "*":
                System.out.println("Multiply: " + multiply(number1, number2));
                break;
            case "-":
                System.out.println("Subtract: " + subtract(number1, number2));
                break;
            case "/":
                System.out.println("divide: " + divide(number1, number2));
                break;
            default:
                System.out.println("Someting went wrong.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First operand:");
        Integer number1 = input.nextInt();
        System.out.print("Second operand:");
        Integer number2 = input.nextInt();
        System.out.print("Operator:");
        String operator = input.next();

        computer(operator, number1, number2);


        input.close();
    }
}
