package builder1;

public class TestPizzaBuilder1 {

	public static void main(String[] args) {
		PizzaBuilder capricciosa = new CapricciosaBuilder();
		PizzaChef chef = new PizzaChef(capricciosa);
		
		chef.makePizza();
		
		System.out.println("We made: " + chef.getPizza());

	}

}
