public class Book {
    private int ID;
    private String name;
    private String author;
    private boolean reserved;

    public Book(int ID, String name, String author, boolean reserved) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        StringBuilder book = new StringBuilder();
        book.append(ID).append(" , ").append(name).append(" , ").append(author).append(" , ");
        if (reserved)
            book.append("Issued");
        else
            book.append("Available");
        return book.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Book) {
            Book book = (Book) object;
            if (ID != book.ID) return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public boolean reserve() {
        if (reserved)
            return false;
        reserved = true;
        return true;
    }
}
