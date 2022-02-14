public class Book {
    private String bookCode, name, author;
    private double price;

    public Book(){
    }
    public Book(String bookCode,String name, String author, double price){
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
