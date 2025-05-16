package onlineClass;

public class task11 {
    private String title;
    private String author;
    private int yearPublish;
    private double price;

    public task11(String title, String author, int yearPublish, double price) {
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
        task11 book1 = new task11("atomic habits", "unknown", 1990, 300d);
        task11 book2 = new task11("sample book", "unknown", 1990, 300d);
    
        System.out.println("Book1" + book1.toString());
        System.out.println("Book2" + book2.toString());
    }
}
