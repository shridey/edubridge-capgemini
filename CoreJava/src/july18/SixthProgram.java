package july18;
class City {
	public String name;
	public long population;
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Population: " + population);
	}
}
public class SixthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city1 = new City();
		city1.name = "Kalyan";
		city1.population = 200000;
		
		City city2 = new City();
		city2.name = "Mumbai";
		city2.population = 20000000;
		
		System.out.println("City 1:");
		city1.display();
		System.out.println("City 2:");
		city2.display();
	}

}
