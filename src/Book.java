public class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isLoaned;
    public static int totalBooks = 0;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isLoaned = false;
        totalBooks++;
    }

    public void displayInfo() {
        System.out.println("Bok: " + title + " av " + author +
                " (" + pages + " sidor)");
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void loanOut() {
        isLoaned = true;
        System.out.println(title + " är nu utlånad");
    }
}
