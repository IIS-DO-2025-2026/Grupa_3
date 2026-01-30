package builder1;

public class PizzaChef {
	private PizzaBuilder pizzaBuilder;

	public PizzaChef(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}
	
	public void makePizza() {
		this.pizzaBuilder.putSauce();
		this.pizzaBuilder.putDough();
		this.pizzaBuilder.putCheese();
		this.pizzaBuilder.putMeat();
	}
	
	public Pizza getPizza() {
		return this.pizzaBuilder.getPizza();
	}

}
