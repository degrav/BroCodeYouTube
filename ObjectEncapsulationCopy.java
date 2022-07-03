
public class ObjectEncapsulationCopy
{
    public static void main(String[] args) {
		
		
		CarB car1 = new CarB("Chevrolet","Camaro",2021);
		//CarB car2 = new CarB("Ford","Mustang",2022);
		//car2.copy(car1);
		CarB car2 = new CarB(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());		
	
	}
}
//*********************************************
