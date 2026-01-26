package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 100;
		System.out.println("Regularna cena: " + amount);
		
		System.out.println("Cena za studente je: " + studentShoppingCart.calculateTotal(amount));
		System.out.println("Cena za penzionere je: " + pensionersShoppingCart.calculateTotal(amount));

		//BuffredWriter - klasa u jeziku Java koja omogućava pisanje podataka u tok podataka (stream) - upis u tekstualnu datoteku (.txt)
		//BuffreadReader
		//ObjectOutputStream - klasa u jeziku Java koja omogućava pisanje objekata u tok podataka (stream) - kreiranje crteža (.bin)
		//ObjectInputStream
	}

}