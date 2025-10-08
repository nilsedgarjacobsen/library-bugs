public class Member {
    public String name;
    public String memberId;
    public Book borrowedBook;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {
        this.borrowedBook = book;
        book.loanOut();
        System.out.println(name + " lånade " + book.title);
    }

    public void displayMemberInfo() {
        System.out.println("Medlem: " + name + " (ID: " + memberId + ")");
        if (borrowedBook != null) {
            System.out.println("  Har lånat: " + borrowedBook.title);
        }
    }

    public int getMaxBooks() {
        return 3;
    }
}
