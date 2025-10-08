public class EBook extends Book{

    public double fileSize;

    public EBook(String title, String author, int pages, double fileSize) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }

    public void displayInfo() {
        System.out.println("E-bok: " + title + " av " + author +
                " (" + pages + " sidor, " + fileSize + " MB)");
    }

}
