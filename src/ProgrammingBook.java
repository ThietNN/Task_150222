public class ProgrammingBook extends Book {
    private String language, framework;

    public ProgrammingBook() {
    }
    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }
    public ProgrammingBook(String bookCode, String name, String author, double price, String language, String framework) {
        super(bookCode, name, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }
    public String getFramework() {
        return framework;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public void setFramework(String framework) {
        this.framework = framework;
    }
}
