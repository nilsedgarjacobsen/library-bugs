public class Library {

    public Book[] books;
    public int bookCount;

    public Library() {
        books = new Book[10];
        bookCount = 0;
    }

    public void addBook(Book book) {
        books[bookCount] = book;
        bookCount++;
        System.out.println("Lade till: " + book.title);
    }

    public void loanBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equals(title)) {
                books[i].loanOut();
                return;
            }
        }
        System.out.println("Boken hittades inte");
    }

    public Book[] getBooks() {
        return books;
    }

}
