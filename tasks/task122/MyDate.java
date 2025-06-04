import tasks.Task121.DateTask;

public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask();
        tasks.task121.DateTask date2 = new DateTask();
        System.out.println(date1.toString());
        System.out.println(date2.toString());
        // display leapyears
        System.out.println(leapYears());
    }
}