package interfaces;

import java.util.List;

import classes.Book;

/**
 * @author dylan
 *
 */
public interface BookDAO {

	/**
	 * @return
	 */
	public List getAllBooks();

	/**
	 * @param isbn
	 * @return
	 */
	public Book getBookByIsbn(int isbn);

	/**
	 * @param book
	 */
	public void saveBook(Book book);

	/**
	 * @param book
	 */
	public void deleteBook(Book book);
}
