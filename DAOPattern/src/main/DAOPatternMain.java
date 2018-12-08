package main;

import java.util.Iterator;
import java.util.List;

import classes.Book;
import classes.BookDAOImpl;
import interfaces.BookDAO;

public class DAOPatternMain {

	public static void main(String[] args) {
		
		BookDAO myLibrary = new BookDAOImpl();
		List<Book> myBooks = myLibrary.getAllBooks();
		Iterator bookIterator = myBooks.iterator();
		while(bookIterator.hasNext()) {
			Book currentBook = (Book) bookIterator.next();
			System.out.println(currentBook.getTitle()+ ", " + currentBook.getAuthor() + ", " + currentBook.getIsbn() );
		}
		Book badBook = new Book("bookc","authorc",3);
		myLibrary.deleteBook(badBook);
		Book goodBook = new Book("bookce","authore",5);
		myLibrary.saveBook(goodBook);
		myBooks = myLibrary.getAllBooks();
		bookIterator = myBooks.iterator();
		while(bookIterator.hasNext()) {
			Book currentBook = (Book) bookIterator.next();
			System.out.println(currentBook.getTitle()+ ", " + currentBook.getAuthor() + ", " + currentBook.getIsbn() );
		}
	}

}
