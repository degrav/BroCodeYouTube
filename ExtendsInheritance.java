
public class ExtendsInheritance
{
   

	public static void main(String[] args) {
		
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		
		Cars car = new Cars();
		
		car.go();
		
		Bicycle bike = new Bicycle();
		
		car.go();
		bike.stop();
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
				
	}
}