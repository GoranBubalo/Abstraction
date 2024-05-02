
public class Car extends Vehicle {
//extends keyword - > inherits the methods and attributes from the superclass
	
	@Override // (overrides) the abstract method in class Vehicle 
			  // We can no longer create a instance of Vehicle class
	void go() {
		System.out.println("The driver is driving the car ");
	}
}
