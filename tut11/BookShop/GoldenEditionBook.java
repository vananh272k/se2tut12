package tut11.BookShop;

public class GoldenEditionBook extends Book {

	public GoldenEditionBook(String title, String author, double price) {
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		return super.getPrice() + super.getPrice() * 0.3;
	}
}
