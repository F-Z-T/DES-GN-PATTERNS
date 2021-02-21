package design.visitor;

public class K�tap implements ItemElement {
	private int price;
	private String isbnNumber;

	public K�tap(int cost, String isbn) {
		this.price=cost;
		this.isbnNumber=isbn;
		
	}
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
