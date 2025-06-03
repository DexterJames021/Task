package onlineClass;

public class Task11 {
    private String title;
    private String author;
    private int yearPublish;
    private double price;

    public Task11(String title, String author, int yearPublish, double price) {
        this.title = title;
        this.author = author;
        this.yearPublish = yearPublish;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[title=" + title + 
        ", author=" + author + 
        ", yearPublish=" + yearPublish + 
        ", price=" + price + "]";
    }

    public static void main(String[] args) {
        Task11 book1 = new Task11("meditation", "unknown", 1990, 300d);
        Task11 book2 = new Task11("metamorphosis", "unknown", 1990, 300d);
        Task11 book3 = new Task11("the fly", "unknown", 1990, 300d);
    
        System.out.println("Book1" + book1.toString());
        System.out.println("Book2" + book2.toString());
        System.out.println("Book3" + book3.toString());
    }
}
