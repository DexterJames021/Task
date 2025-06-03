public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 
        int sum = sumArray(numbers);
        System.out.println("Sum of array elements: " + sum);
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
