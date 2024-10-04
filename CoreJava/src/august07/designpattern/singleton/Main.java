package august07.designpattern.singleton;

class Database {
	private static Database database;
	
	private Database() {
		System.out.println("Constructor called!");
	}
	
	public static Database getConnection() {
		if (database == null) {
			database = new Database();
		}
		
		return database;
	}
	
	public void getRecords() {
		System.out.println("Getting Records...");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = Database.getConnection();
		db.getRecords();
		
		// Creating a Singleton Object
		Database db1 = Database.getConnection();
		db1.getRecords();
	}

}
