package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		/* Čvrstim vezivanjem objekata sa konkretnim klasama
		Car car = new Car();
		Plane plane = new Plane();
		Train train = new Train();
		Boat boat = new Boat();
		*/
		
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		//Vehicle boat = new Boat();
		Boat boat = new Boat();
		BoatAdapter boatAdapter = new BoatAdapter(boat);
		
		car.goFaster();
		plane.goFaster();
		train.goFaster();
		boatAdapter.goFaster();			

	}

}
