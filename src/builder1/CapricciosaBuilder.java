package builder1;

public class CapricciosaBuilder implements PizzaBuilder {
	private Pizza pizza;
	
	public CapricciosaBuilder() {
		this.pizza = new Pizza();
	}

	@Override
	public void putDough() {
		pizza.setDough("klasično");

	}

	@Override
	public void putSauce() {
		pizza.setSauce("paradajz sos");

	}

	@Override
	public void putMeat() {
		pizza.setMeat("šunka");

	}

	@Override
	public void putCheese() {
		pizza.setCheese("mozzarella");

	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
