package builder1;

public class SeafoodPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;
	
	public SeafoodPizzaBuilder() {
		this.pizza = new Pizza();
	}

	@Override
	public void putDough() {
		this.pizza.setDough("integralno");

	}

	@Override
	public void putSauce() {
		this.pizza.setSauce("paradajz sos");

	}

	@Override
	public void putMeat() {
		this.pizza.setMeat("škampi");
		//this.pizza.setMeat("tunjevina");

	}

	@Override
	public void putCheese() {
		this.pizza.setCheese("gauda");

	}

	@Override
	public Pizza getPizza() {
		return this.pizza;
	}

}
