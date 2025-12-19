package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		/*DatabaseConnection databaseConnection1 = new DatabaseConnection();
		DatabaseConnection databaseConnection2 = new DatabaseConnection();*/
		
		DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
		DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
		
		System.out.println(databaseConnection1);
		System.out.println(databaseConnection2);
		
		System.out.println("Hash vrednost 1. objekta: " + Integer.toHexString(databaseConnection1.hashCode()));
		
		DatabaseConnectionLazy databaseConnectionLazy1 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy databaseConnectionLazy2 = DatabaseConnectionLazy.getInstance();
		
		System.out.println(databaseConnectionLazy1);
		System.out.println(databaseConnectionLazy2);
	}

}
