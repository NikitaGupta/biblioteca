public class Book {
    private int ID;
    private String name;
    private String author;

    public Book(int ID, String name, String author) {
        this.ID = ID;
        this.name = name;
        this.author =author;
    }
    
    @Override
    public String toString(){
        return ID + " , " +name + " , " +author;
    }
}
