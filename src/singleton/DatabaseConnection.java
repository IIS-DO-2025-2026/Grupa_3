package singleton;

//1. način - nestrpljivo učitivanje
public class DatabaseConnection {
	
	private static DatabaseConnection instance = new DatabaseConnection();

	/*public*/ private DatabaseConnection() {

	}
	
	//logika za povezivanje na BP

	public static DatabaseConnection getInstance() {
		return instance;
	}
	
}
