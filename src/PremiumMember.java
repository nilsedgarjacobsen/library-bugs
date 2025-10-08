public class PremiumMember extends Member{
    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    public int getMaxBooks() {
        return 10;
    }

    public void displayMemberInfo() {
        System.out.println("Premium-medlem: " + name + " (ID: " + memberId + ")");
        if (borrowedBook != null) {
            System.out.println("  Har lånat: " + borrowedBook.title);
        }
        System.out.println("  Max böcker: " + getMaxBooks());
    }
}
