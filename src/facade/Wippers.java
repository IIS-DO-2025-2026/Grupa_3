package facade;

public class Wippers {
	private Car car;
	private String message;
	
	public Wippers(Car car) {
		this.car = car;
	}
	
	public void autoStartWippers() {
		if(car.isRaining())
			message = "Wippers are on. ";
		else
			message = "Wippers are off. ";
	}

	public String getMessage() {
		return message;
	}

}