package onlineClass;

/*
 * print fullname
*/

class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void printFullName(){
        System.out.println(firstName + lastName);
    }
}

public class task10 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("dexter", "papa"),
            new Student("papa", "dexter"),
            new Student("james", "papa"),
            new Student("papa", "james")
        };

        for (Student student : students) {
            student.printFullName();
        }

    }
}


