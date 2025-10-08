public class Main {
    public static void main(String[] args) {
        System.out.println("=== Bibliotekssystem - Bugghunt ===\n");

        // Test 1: Skapa och hantera böcker
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new EBook("Digital Fortress", "Dan Brown", 510, 2.5);

        System.out.println("Test 1: Skapa böcker");
        book1.displayInfo();
        book2.displayInfo();

        // Test 2: Låna ut böcker
        System.out.println("\nTest 2: Låna böcker");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.loanBook("1984");
        library.loanBook("1984"); // Försök låna samma bok igen

        // Test 3: Hantera medlemmar
        System.out.println("\nTest 3: Medlemmar");
        Member member1 = new Member("Anna", "001");
        Member member2 = new PremiumMember("Bengt", "002");

        member1.borrowBook(book1);
        member2.borrowBook(book2);

        member1.displayMemberInfo();
        member2.displayMemberInfo();

        // Test 4: Räkna böcker
        System.out.println("\nTest 4: Statistik");
        System.out.println("Totalt antal böcker skapade: " + Book.getTotalBooks());

        // Test 5: Ändra bokinformation
        System.out.println("\nTest 5: Uppdatera bokinformation");
        book1.setPages(-50); // Försök sätta ogiltigt värde
        book1.displayInfo();
    }
}