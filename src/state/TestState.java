package state;

public class TestState {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.turnOff();
		car.turnOn();
		car.move();
		car.turnOff();
		car.goIdle();
		car.turnOff();

	}

}