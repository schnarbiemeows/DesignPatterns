package classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import interfaces.BookDAO;

/**
 * @author dylan
 *
 */
public class BookDAOImpl implements BookDAO {

	List<Book> library;

	/**
	 * 
	 */
	public BookDAOImpl() {
		super();
		library = new ArrayList<Book>();
		library.add(new Book("booka", "authora", 1));
		library.add(new Book("bookb", "authorb", 2));
		library.add(new Book("bookc", "authorc", 3));
		library.add(new Book("bookd", "authord", 4));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.BookDAO#getAllBooks()
	 */
	@Override
	public List getAllBooks() {

		return library;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.BookDAO#getBookByIsbn(int)
	 */
	@Override
	public Book getBookByIsbn(int isbn) {

		for (Book book : library) {
			if (book.getIsbn() == isbn) {
				return book;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.BookDAO#saveBook(classes.Book)
	 */
	@Override
	public void saveBook(Book book) {

		library.add(book);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfaces.BookDAO#deleteBook(classes.Book)
	 */
	@Override
	public void deleteBook(Book book) {

		Iterator<Book> myIterator = library.iterator();
		while (myIterator.hasNext()) {
			Book currentBook = myIterator.next();
			if (book != null && book.getIsbn() == currentBook.getIsbn()) {
				myIterator.remove();
			}
		}
	}

}
