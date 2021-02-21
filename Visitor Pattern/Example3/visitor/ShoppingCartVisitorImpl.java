package design.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Kýtap Kýtap) {
		int fýyat=0;
		//apply 5$ discount if book price is greater than 50
		if(Kýtap.getPrice() > 50){
			fýyat = Kýtap.getPrice()-5;
		}else fýyat = Kýtap.getPrice();
		System.out.println("Kýtap ISBN::"+Kýtap.getIsbnNumber() + " fiyat ="+fýyat);
		return fýyat;
	}

	@Override
	public int visit(Meyve Meyve ) {
		int fýyat = Meyve .getPricePerKg()*Meyve.getWeight();
		System.out.println(Meyve .getName() + " fiyat = "+fýyat);
		return fýyat;
	}

}