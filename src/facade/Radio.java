package facade;

public class Radio {
	private Car car;
	private String message;
	
	public Radio(Car car) {
		this.car = car;
	}
	
	public void autoTurnOnRadio() {
		if(car.isPreviousState())
			message = "Radio is turned on ";
		else 
			message = "Radio is turned off. ";
	}

	public String getMessage() {
		return message;
	}
	
	

}