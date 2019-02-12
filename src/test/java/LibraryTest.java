import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;
    Book book3;
    Book book4;

   @Before
    public void before(){
       library = new Library();
       book = new Book("The Shining", "Stephen King", "fiction");
       book2 = new Book("Lemons: A History", "Cornelius Flowers", "biography");
       book3 = new Book("Curses and How to Yield Them", "Ursula Smith", "non-fiction");
       book4 = new Book("A Confederacy of Dunces", "John Kennedy Toole", "fiction");
   }

   @Test
    public void hasBooks(){
       assertEquals(0, library.getNumberOfBooks());
   }

   @Test
    public void canAddBook(){
       library.addBook(book);
       assertEquals(1, library.getNumberOfBooks());
   }

   
}
