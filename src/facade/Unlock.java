package facade;

public class Unlock {
	private Car car;
	private int remoteCode;
	private String message;
	
	public Unlock(Car car, int remoteCode) {
		this.car = car;
		this.remoteCode = remoteCode;
	}
	
	public boolean unlockTheCar() {
		if(car.getRemoteCode() == remoteCode) {
			message = "Car is now unlocked. ";
			return true;
		} else {
			message = "Wrong remote!!! ";
			return false;
		}
	}

	public String getMessage() {
		return message;
	}

}