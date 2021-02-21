package design.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(K�tap K�tap) {
		int f�yat=0;
		//apply 5$ discount if book price is greater than 50
		if(K�tap.getPrice() > 50){
			f�yat = K�tap.getPrice()-5;
		}else f�yat = K�tap.getPrice();
		System.out.println("K�tap ISBN::"+K�tap.getIsbnNumber() + " fiyat ="+f�yat);
		return f�yat;
	}

	@Override
	public int visit(Meyve Meyve ) {
		int f�yat = Meyve .getPricePerKg()*Meyve.getWeight();
		System.out.println(Meyve .getName() + " fiyat = "+f�yat);
		return f�yat;
	}

}