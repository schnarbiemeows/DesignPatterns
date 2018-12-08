package classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import interfaces.BookDAO;

public class BookDAOImpl implements BookDAO {

	List<Book> library;
	
	public BookDAOImpl() {
		super();
		library = new ArrayList<Book>();
		library.add(new Book("booka","authora",1));
		library.add(new Book("bookb","authorb",2));
		library.add(new Book("bookc","authorc",3));
		library.add(new Book("bookd","authord",4));
	}

	@Override
	public List getAllBooks() {
		
		return library;
	}

	@Override
	public Book getBookByIsbn(int isbn) {
		
		for(Book book : library) {
			if(book.getIsbn()==isbn) {
				return book;
			}
		}
		return null;
	}

	@Override
	public void saveBook(Book book) {
		
		library.add(book);
	}

	@Override
	public void deleteBook(Book book) {
		
		Iterator<Book> myIterator = (Iterator<Book>) library.iterator();
		while(myIterator.hasNext()) {
			Book currentBook = (Book) myIterator.next();
			if(book!=null&&book.getIsbn()==currentBook.getIsbn()) {
				myIterator.remove();
			}
		}
	}

}
