import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library library2;
    Book book;
    Book book2;
    Book book3;
    Book book4;
    Borrower borrower;

   @Before
    public void before(){
       library = new Library(10);
       library2 = new Library(8);
       book = new Book("The Shining", "Stephen King", "fiction");
       book2 = new Book("Lemons: A History", "Cornelius Flowers", "biography");
       book3 = new Book("Curses and How to Yield Them", "Ursula Smith", "non-fiction");
       book4 = new Book("A Confederacy of Dunces", "John Kennedy Toole", "fiction");
       borrower = new Borrower("Jim Jones");
   }

   @Test
    public void hasBooks(){
       assertEquals(0, library.getNumberOfBooks());
   }

   @Test
   public void canSetCapacity(){
       assertEquals(10, library.getCapacity());
   }

   @Test
    public void canAddBook(){
       library.addBook(book);
       assertEquals(1, library.getNumberOfBooks());
   }

   @Test
    public void cantAddOverCapacity(){
        for (int i = 0; i<12; i++){
            library.addBook(book);
        }
       assertEquals(10, library.getNumberOfBooks());
   }

   @Test
    public void canAddToBorrowerCollection(){
       borrower.borrowBook(book);
       assertEquals(1, borrower.checkNumberOfBooks());
   }


}
