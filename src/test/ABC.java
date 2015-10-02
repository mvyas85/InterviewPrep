package test;

public class ABC {

	int i;
	public static void main(String args[]){
		ABC1 abc = new ABC1();
		abc.id();
		
		int newidd = abc.id;
		int idd = ABC1.id;
		int ass = abc.id;
		System.out.println("Hello world !");
	}
	
	
}



























//A class to display the attributes of the vehicle
//public class Vehicle {
//	protected String color;
//	protected  int speed; 
//	protected  void attributes() {
//	   System.out.println("Color : " + color);
//	   System.out.println("Speed : " + speed); 
//	   }
//}
////A subclass which extends for vehicle
//class Car extends Vehicle {
//	private int CC;
//	private int gears;
//	public void attributescar() {
//	   // The subclass refers to the members of the superclass
//	   System.out.println("Color of Car : " + color);
//	   System.out.println("Speed of Car : " + speed);
//	   System.out.println("CC of Car : " + CC);
//	   System.out.println("No of gears of Car : " + gears);
//	}
//}
//
//class Car2 extends Car {
//	public void attributescar() {
//	   // The subclass refers to the members of the superclass
//	   System.out.println("Color of Car : " + color);
//	   System.out.println("Speed of Car : " + speed);
//	   System.out.println("CC of Car : " + CC);
//	   System.out.println("No of gears of Car : " + gears);
//	}
//}


