package facade;

public class Car {
	private int remoteCode = 1234; //otkljucavanje
	private String carKey = "šara"; //davanje kontakta
	private boolean isRaining = false;
	private boolean previousState = true; //radio
	
	public int getRemoteCode() {
		return remoteCode;
	}
	
	public String getCarKey() {
		return carKey;
	}
	
	public boolean isRaining() {
		return isRaining;
	}
	
	public boolean isPreviousState() {
		return previousState;
	}
	
	
}