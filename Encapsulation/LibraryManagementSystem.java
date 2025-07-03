abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private Borrower borrower; // Encapsulated borrower details

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Encapsulated access to borrower
    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration(); 
}

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks
    }

    @Override
    public boolean reserveItem(String userId) {
        if (!isReserved) {
            isReserved = true;
            setBorrower(new Borrower(userId));
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public boolean reserveItem(String userId) {
        if (!isReserved) {
            isReserved = true;
            setBorrower(new Borrower(userId));
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public boolean reserveItem(String userId) {
        if (!isReserved) {
            isReserved = true;
            setBorrower(new Borrower(userId));
            return true;
        }
        return false;
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Encapsulated Borrower class
class Borrower {
    private String userId; // Only userId is stored for privacy

    public Borrower(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}

// Example usage
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "Effective Java", "Joshua Bloch");
        items[1] = new Magazine("M001", "National Geographic", "Various");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("user123");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }
            System.out.println();
        }
    }
}
