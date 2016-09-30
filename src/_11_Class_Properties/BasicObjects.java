package _11_Class_Properties;

public class BasicObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//paulsDreamCar - is the object or instance of the Car class. 
		Car paulsDreamCar = new Car();
		paulsDreamCar.make= "Tesla";
		paulsDreamCar.model= "Model 3";
		paulsDreamCar.color= "Black";
		paulsDreamCar.isFast= true;
		paulsDreamCar.isElectric= true;
		
		
		//Make another car that is your dream ar and add 8 properties
		
		Car johnsDreamCar = new Car ();
		johnsDreamCar.make= "Lamborghini";
		johnsDreamCar.model= "Aventador";
		johnsDreamCar.color= "Matte Black";
		johnsDreamCar.isFast= true;
		johnsDreamCar.isElectric = false;
		johnsDreamCar.horsepower= 750;
		johnsDreamCar.leatherSeats= true;
		johnsDreamCar.marketSegment= "Luxury Sports Car";
		
		System.out.println(johnsDreamCar.make);
		
		Integer number = new Integer(5);
		System.out.println(number);
		System.out.println(number.getClass());
		System.out.println(number.toString());
		
		
		
		
		
		
		
		
	}

}
