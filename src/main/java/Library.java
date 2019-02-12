import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getNumberOfBooks(){
        return this.collection.size();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addBook(Book book){
        if (getNumberOfBooks() < this.capacity) {
            this.collection.add(book);
        }
    }
    


}
