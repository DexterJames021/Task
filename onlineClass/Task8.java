package onlineClass;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(compute(1, 2, 4, 5));
    }

    public static int compute(int... nums) {
        int totalOfTriangulars = 0;

        for (int n : nums) {
            int triangular = n * (n + 1) / 2;
            System.out.println("Cumulative sum from 1 to " + n + " = " + triangular);
            totalOfTriangulars += triangular;
        }

        return totalOfTriangulars;
    }
}
