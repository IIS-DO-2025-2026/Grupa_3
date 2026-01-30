package builder1;

public interface PizzaBuilder {
	public void putDough();
	public void putSauce();
	public void putMeat();
	public void putCheese();
	
	public Pizza getPizza();

}
