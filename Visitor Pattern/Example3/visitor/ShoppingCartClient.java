package design.visitor;

public class ShoppingCartClient {

	public static void main(String[] args) {
	ItemElement[] items = new ItemElement[]{
			new Kýtap(20, "1234"),
			new Kýtap(100, "5678"),
			new Meyve(10, 2, "Muz"), 
			new Meyve(5, 5, "Elma")};
		
	int ToplamFýyat = calculatePrice(items);
	System.out.println("Toplam fiyat = "+ToplamFýyat);
	}

	private static int calculatePrice(ItemElement[] items) {
	ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
	int Toplam=0;
	
	for(ItemElement item : items)
	{
		Toplam = Toplam + item.accept(visitor);
	}
		return Toplam;
	}

}
