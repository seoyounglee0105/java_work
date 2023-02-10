package ch07;

public class MainTest {

	public static void main(String[] args) {
		Human james = new Human("James", 5000);
		Human tomas = new Human("Tomas", 10000);
		Bus bus100 = new Bus(100);
		Subway subway1 = new Subway(1);
		
		james.takeBus(bus100);
		tomas.takeSubway(subway1);
		
		// -----------
		
		Human edward = new Human("Edward", 20000);
		Taxi taxiKakao = new Taxi("Kakao");
		edward.takeTaxi(taxiKakao);
	}

}
