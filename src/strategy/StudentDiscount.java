package strategy;

public class StudentDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double amount) {
		//10% popust
		return amount*0.1;
	}

}