public class Polymorphism
{
    	public static void main(String[] args) {
		
		// polymorphism = 	greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type
		
		CarC car = new CarC();
		BicycleC bicycle = new BicycleC();
		BoatC boat = new BoatC();
		
		VehicleC[] racers = {car,bicycle,boat};
		
		for(VehicleC x : racers) {
			x.go();
		}
		
	}
}