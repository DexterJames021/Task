package programmingChallenge;
import java.util.Arrays;

@FunctionalInterface
interface IOperation  {
    public int sum(int[] number);
}

public class SumIntegers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        IOperation operation = (int[] nums) -> {
            int result = 0;
            for (int num : nums) {
                result += num;
            }
            return result;
        };

        int IItem = operation.sum(numbers);
        System.out.println("The sum is: " + IItem + "(lambda function)");

        // int total = Arrays.stream(numbers).sum();
        // System.out.println("The sum is: " + total);
    }
}

