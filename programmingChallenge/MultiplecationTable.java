public class MultiplecationTable {
    public static void main(String[] args) {
        int multipleBy = 10; 

        System.out.println("Multiplication Table for " + multipleBy + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(multipleBy + " x " + i + " = " + (multipleBy * i));
        }
    }
}
