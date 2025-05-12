package onlineClass;

public class task3 {
    String a = "Dexter!";  
    String b = a;
    String c = a + "!"; 
    String d = "Dexter!!"; 

    boolean b1 = a == b;
    boolean b2 = d.equals(b + "!");
    boolean b3 = !c.equals(a);

    public static void main(String[] args) {
        task3 t = new task3();

        System.out.println("b1: " + t.b1);
        System.out.println("b2: " + t.b2);
        System.out.println("b3: " + t.b3);

        if (t.b1 && t.b2 && t.b3) 
            System.out.print("TRUTY");
        else 
            System.out.print("FALSY");
    }
}