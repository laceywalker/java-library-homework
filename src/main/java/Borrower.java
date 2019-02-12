import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowerCollection;

    public Borrower(String name){
        this.name = name;
        this.borrowerCollection = new ArrayList<>();
    }

    public int checkNumberOfBooks(){
        return this.borrowerCollection.size();
    }

    public void borrowBook(Book book){
        this.borrowerCollection.add(book);
    }
}
