package classes;

/**
 * @author dylan
 *
 */
public class Book {

	private String title;
	private String author;
	private int isbn;

	/**
	 * @param title
	 * @param author
	 * @param isbn
	 */
	public Book(String title, String author, int isbn) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
