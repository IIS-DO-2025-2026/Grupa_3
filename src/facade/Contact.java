package facade;

public class Contact {
	private Car car;
	private String carKey;
	private String message;
	
	public Contact(Car car, String carKey) {
		this.car = car;
		this.carKey = carKey;
	}
	
	public boolean giveContact() {
		if(car.getCarKey() == carKey) {
			message = "The car is running. ";
			return true;
		} else {
			message = "Wrong key!!! ";
			return false;
		}
	}
	
	public String getMessage() {
		return message;
	}
	
	

}