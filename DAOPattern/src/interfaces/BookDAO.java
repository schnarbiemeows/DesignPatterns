package interfaces;

import java.util.List;

import classes.Book;

public interface BookDAO {

	public List getAllBooks();
	public Book getBookByIsbn(int isbn);
	public void saveBook(Book book);
	public void deleteBook(Book book);
}
