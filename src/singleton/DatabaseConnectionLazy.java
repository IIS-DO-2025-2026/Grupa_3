package singleton;

//2. način
public class DatabaseConnectionLazy {
	
	private static DatabaseConnectionLazy instance;
	
	private DatabaseConnectionLazy() {
		
	}

	public static DatabaseConnectionLazy getInstance() {
		if(instance==null)
			instance = new DatabaseConnectionLazy();
		return instance;
	}
	
	

}
