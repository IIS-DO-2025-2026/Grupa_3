package strategy;

public class PensionersDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double amount) {
		//25%
		return amount * 0.25;
	}

}