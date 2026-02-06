package state;

public class Car implements CarBehaviour{
	private TurnedOffState turnedOffState;
	private TurnedOnState turnedOnState;
	private IdleState idleState;
	private MovingState movingState;
	
	private CarBehaviour currentState;
	
	public Car() {
		turnedOffState = new TurnedOffState(this);
		turnedOnState = new TurnedOnState(this);
		idleState = new IdleState(this);
		movingState = new MovingState(this);
		
		currentState = turnedOffState;
	}

	@Override
	public void turnOn() {
		currentState.turnOn();
		
	}

	@Override
	public void turnOff() {
		currentState.turnOff();
		
	}

	@Override
	public void goIdle() {
		currentState.goIdle();
		
	}

	@Override
	public void move() {
		currentState.move();
		
	}

	public TurnedOffState getTurnedOffState() {
		return turnedOffState;
	}

	public void setTurnedOffState(TurnedOffState turnedOffState) {
		this.turnedOffState = turnedOffState;
	}

	public TurnedOnState getTurnedOnState() {
		return turnedOnState;
	}

	public void setTurnedOnState(TurnedOnState turnedOnState) {
		this.turnedOnState = turnedOnState;
	}

	public IdleState getIdleState() {
		return idleState;
	}

	public void setIdleState(IdleState idleState) {
		this.idleState = idleState;
	}

	public MovingState getMovingState() {
		return movingState;
	}

	public void setMovingState(MovingState movingState) {
		this.movingState = movingState;
	}

	public CarBehaviour getCurrentState() {
		return currentState;
	}

	public void setCurrentState(CarBehaviour currentState) {
		this.currentState = currentState;
	}
	
	
	
//	private State state;
//	
//	public void turnOn() {
//		if(state.instanceOf(turnedOnState))
//			System.out.println("Car is already turned on...");
//		else if(state.instanceOf(idle))
//			System.out.println("Car is already turned on...");
//		else if(state.instanceOf(moving))
//			System.out.println("Car is already turned on...");
//		else if(state.instanceOf(turnedOffState))
//			System.out.println("Car is now turned on...");		
//	}

}