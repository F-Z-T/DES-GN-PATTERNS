package design.visitor;

public class Kýtap implements ItemElement {
	private int price;
	private String isbnNumber;

	public Kýtap(int cost, String isbn) {
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
