package tut11.BookShop;

public class Book {
	private String title;
	private String author;
	private double price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() < 3) {
			throw new IllegalArgumentException("Title not valid!");
		} else {
			this.title = title;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		// TODO: Validate as it is written in Constraints
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 1) {
			throw new IllegalArgumentException("Price not valid!");
		}
		this.price = price;
	}

	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator()).append("Title: ")
				.append(this.getTitle()).append(System.lineSeparator()).append("Author: ").append(this.getAuthor())
				.append(System.lineSeparator()).append("Price: ").append(this.getPrice())
				.append(System.lineSeparator());
		return sb.toString();
	}

}
